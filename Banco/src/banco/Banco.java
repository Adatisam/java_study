/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author matheus
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco bc1 = new ContaBanco();
        bc1.setNumConta(00001);
        bc1.setNome("Takita");
        bc1.abriConta("CC");
        
        ContaBanco bc2 = new ContaBanco();
        bc2.setNumConta(00002);
        bc2.setNome("PeixeBoi");
        bc2.abriConta("CP");
        
        
        bc1.depositar(150);
        //bc1.fecharConta();
        //bc1.sacar();
        //bc1.pagarMensal();
        
        bc2.depositar(300);
        //bc2.fecharConta();
        //bc2.sacar();
        //bc2.pagarMensal();
        
        
        bc1.estadoAtual();
        bc2.estadoAtual();
    }
    
}
