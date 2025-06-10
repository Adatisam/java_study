/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroproduto;

/**
 *
 * @author matheus
 */
public class Produto {
    Integer id; 
    Integer quantidade;
    String nome;
    Double preco;
    
    public Produto(Integer id, Integer quantidade, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getQuant(){
        return quantidade;
    }
    public void setQuant(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
}
