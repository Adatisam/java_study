/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reinoanimal;

/**
 *
 * @author matheus
 */
public class ReinoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setCorPelo("Caramelo");
        m.setIdade(5);
        m.setMembros(4);
        m.setPeso(12.4f);
        
        m.alimentar();
        m.locomover();
        m.emitirsom();
        
        r.setCorEscama("Verde");
        r.setIdade(4);
        r.setMembros(5);
        r.setPeso(7.65f);
        
        r.alimentar();
        r.locomover();
        r.emitirsom();
        
        p.setCorEscama("Laranja");
        p.setIdade(2);
        p.setMembros(7);
        p.setPeso(0.300f);
        
        p.alimentar();
        p.locomover();
        p.emitirsom();
        p.soltarBolha();
        
        a.setCorPena("Azul");
        a.setIdade(8);
        a.setMembros(4);
        a.setPeso(0.150f);
        
        a.alimentar();
        a.locomover();
        a.emitirsom();
        a.fazerNinho();*/
        
        Cachorro cao = new Cachorro();
        cao.setCorPelo("Branco");
        cao.setIdade(2);
        cao.setMembros(4);
        
        cao.alimentar();
        cao.locomover();
        cao.emitirsom();
        cao.reagir(false);
        cao.reagir("Olá");
        cao.reagir(4, 5.78f);
        cao.reagir(14, 40);
        
    }
    
}
