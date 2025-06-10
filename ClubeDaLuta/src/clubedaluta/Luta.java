/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubedaluta;

import java.util.Random;

/**
 *
 * @author matheus
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        } else {
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }
    
    public void Lutar() {
        if (aprovada) {
            System.out.println("---DESAFIADO---");
            desafiado.apresentar();
            System.out.println("---DESAFIANTE---");
            desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("---RESUTADO DA LUTA---");
            switch (vencedor) {
                case 1:
                    System.out.println("---EMPATE---");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 2:
                    System.out.println("Vitória do " + this.desafiado);
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 3:
                    System.out.println("Vitória do " + this.desafiante);
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
                default:
                    throw new AssertionError();
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
