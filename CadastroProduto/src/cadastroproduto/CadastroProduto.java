/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroproduto;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class CadastroProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        
        ControleProduto controleProduto = new ControleProduto();
        Produto prod = new Produto(Integer.SIZE, Integer.MIN_VALUE, "texto", Double.NaN);
        
        Integer id = 0;
        String nome;
        Integer quantidade = 0;
        Double preco = 0.0;
        
        System.out.println(
                "Opções \n 1-Cadastrar produto\n 2-Remover produto\n 3-Listar\n 4-Editar produto\n"
        );
        
        int numopc = 0;
        
        System.out.println("nº: ");
        numopc = dados.nextInt();
        
        while (numopc == 1) {            
            switch (numopc) {
                case 1 -> {
                    System.out.println("ID do produto: ");
                    id = dados.nextInt();
                    prod.setId(id);
                    
                    System.out.println("Nome do produto: ");
                    nome = dados.next();
                    prod.setNome(nome);
                    
                    System.out.println("Quantidade do produto: ");
                    quantidade = dados.nextInt();
                    prod.setQuant(quantidade);
                    
                    System.out.println("Preço do produto: ");
                    preco = dados.nextDouble();
                    prod.setPreco(preco);
                    
                    System.out.println("\nCadastrar mais Produtos?\n 1-Sim\n 0-Não\n");
                    numopc = dados.nextInt();
                    
                    controleProduto.adicionar(prod);
                    prod = new Produto(id, quantidade, nome, preco);
                }
                    
                case 2 -> {
                    
                }
                    
                case 3 -> controleProduto.ListaProdutos();
                    
                case 4 -> {
                    
                }
                    
                default -> throw new AssertionError();
                
            }
        }
    
        dados.close();
    }
    
}
