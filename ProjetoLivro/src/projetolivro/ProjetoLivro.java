/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolivro;

/**
 *
 * @author matheus
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[3];
        Livro[] livro = new Livro[2];
        
        pessoa[0] = new Pessoa("Murilo", 18, "M");
        pessoa[1] = new Pessoa("Biel", 26, "M");
        
        livro[1] = new Livro("Java POO", "Matheus Adati", 200, pessoa[0]);
        livro[1].abrir();
        livro[1].folhear(1);
        livro[1].avancarPag();
        livro[1].fechar();
        
        System.out.println(livro[1].detalhes()); 
    }
    
}
