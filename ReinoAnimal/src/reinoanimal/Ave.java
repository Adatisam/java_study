/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reinoanimal;

/**
 *
 * @author matheus
 */
public class Ave extends Animal{
    private String corPena;
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de ave");
    }
    
    public void fazerNinho() {
        System.out.println("Construiu ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
