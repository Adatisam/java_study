/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author matheus
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String nome;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("-------------------------------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
        System.out.println("-------------------------------------------------");
    }

    public void abriConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso. ");
    }
    
    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("Consta ainda contem dinheiro, não pode ser fechada!");
        } else if (getSaldo() < 0){
            System.out.println("Consta em débito, não pode ser fechada!");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float valor){
        if (getStatus()) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " feito com sucesso na conta de "
            + getNome() + ".");
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!, por favor crie uma conta.");
        }
    }
    
    public void sacar(float valor){
        if (getStatus()) {
            if (getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso na conta de " + getNome() + ".");
            } else {
                System.out.println("Saldo insufuciente para saque!");
            }
        } else {
            System.out.println("Impossivel realizar o saque de uma conta inexistente, "
            + "por favor crie uma conta.");
        }
    }
    
    public void pagarMensal(){
        float valor = 0;
        if (getTipo() == "CC") {
            valor = 12;
        } else if (getTipo() == "CP") {
            valor = 20;
        }
        if (getStatus()) {
            if (getSaldo() > valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso na conta de " + getNome() + ".");
            } else {
                System.out.println("Saldo insuficiente na conta de " + getNome()
                + ", para realizar o pagamneto da mensalidade.");
            }
        } else {
            System.out.println("Impossivel realizar o pagamento mensal de uma conta inexistente, "
            + "por favor crie uma conta.");

        }
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
   
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
