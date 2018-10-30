package classes;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Livro {

    private String nome;
    private int ano;
    private String descricao;
    private boolean situacao;
    private String id;
    private ArrayList<Emprestimos> emprestimo;

    public Livro(String nome, int ano, String descricao, String id) {
        this.nome = nome;
        this.ano = ano;
        this.descricao = descricao;
        this.situacao = false; //false: liberado
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Emprestimos> getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(ArrayList<Emprestimos> emprestimo) {
        this.emprestimo = emprestimo;
    }

}
