package classes;

/**
 *
 * @author gabriel
 */
public class Livro {

    private String nome;
    private int ano;
    private String descricao;
    private boolean situacao;

    public Livro(String nome, int ano, String descricao) {
        this.nome = nome;
        this.ano = ano;
        this.descricao = descricao;
        this.situacao = false; //false: liberado
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

    /*   
    @Override
    public String toString(){
        return null;
    }
     */
}
