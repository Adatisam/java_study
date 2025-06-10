/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controleremoto;

/**
 *
 * @author matheus
 */
public class ControleRemoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContrloRemot c = new ContrloRemot();
        c.ligar();
        c.maisVolume();
        //c.menosVolume();
        c.ligarMudo();
        //c.desligarMudo();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}
