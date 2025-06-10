/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroproduto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class ControleProduto {
    List<Produto> produto = new ArrayList<>();
    
    public void adicionar(Produto prod){
        produto.add(prod);
    }
    
    public void ListaProdutos(){
        produto.forEach((p) -> {
            System.out.println("Id: " + p.getId());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Quantidade: " + p.getQuant());
            System.out.println("Preço: " + p.getPreco());
            System.out.println("------------------------------");
        });
    }
    
    public void Editar(){
        System.out.println("Digite o Id do produto que deseja editar: ");
        int id = Integer.parseInt(scanner)
    }
}
