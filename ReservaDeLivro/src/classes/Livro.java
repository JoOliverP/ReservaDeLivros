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
    private Categoria categoria;

    public Livro(String nome, int ano, String descricao) {
        this.nome = nome;
        this.ano = ano;
        this.descricao = descricao;
        this.situacao = true; //inicia como liberado
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

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /*   
    @Override
    public String toString(){
        return null;
    }
     */
}
