/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author matheus
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" + "titulo = " + titulo + ";\n autor = "
                + autor + ";\n totPaginas = " + totPaginas + 
                ";\n pagAtual = " + pagAtual + ";\n aberto = " + 
                aberto + ";\n leitor = " + leitor.getNome() +
                ", idade = " + leitor.getIdade() + 
                ", sexo = " + leitor.getSexo() + '}';
    }
    
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        aberto = true;
    }

    @Override
    public void fechar() {
        aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > totPaginas) {
            pagAtual = 0;
        } else {
            pagAtual = p;
        }
        pagAtual = p;
    }

    @Override
    public void avancarPag() {
        pagAtual++;
    }

    @Override
    public void voltarPag() {
        pagAtual--;
    }
    
    
}
