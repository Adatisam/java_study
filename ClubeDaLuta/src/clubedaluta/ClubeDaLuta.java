/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubedaluta;

/**
 *
 * @author matheus
 */
public class ClubeDaLuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Japonis", "japão", 25, 1.68f, 96.70f, 0, 0, 0);
        l[1] = new Lutador("Takita", "Alemanha", 23, 1.86f, 97.80f, 0, 0, 0);
        
        Luta clube1 = new Luta();
        
        clube1.marcarLuta(l[0], l[1]);
        clube1.Lutar();
        l[0].status();
        l[1].status();
    }
}
