/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleremoto;

/**
 *
 * @author matheus
 */
public class ContrloRemot implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ContrloRemot() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----MENU----");
        System.out.println("Esta ligado? " + getLigado());
        System.out.println("Esta Contando? " + getTocando());
        System.out.print("Volume: " + getVolume());
        for(int i = 0; i <= getVolume(); i += 10) {
            System.out.print("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (getLigado()){
            setVolume(getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar o volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado()){
            setVolume(getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir o volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (getLigado() && !(getTocando())) {
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (getLigado() && getTocando()) {
            setTocando(false);
        }
    } 
}
