package classes;

/**
 *
 * @author gabriel
 */
public class Cliente extends Pessoa{
    private String cpf;
    private String senha;
    private boolean situacao;
    private boolean bloqueio;
 
    public Cliente(String cpf, String nome, String sobrenome, String telefone, String senha, String email) {
        super(email,nome,sobrenome,telefone);
        this.cpf = cpf;
        this.senha = senha;
        this.situacao = false;   //liberado
        this.bloqueio = false;   //não bloqueado
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
     public boolean getBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(boolean bloqueio) {
        this.bloqueio = bloqueio;
    }

    
}
