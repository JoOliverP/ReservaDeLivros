package classes;

/**
 *
 * @author gabriel
 */
public class Cliente extends Pessoa{
    private String matricula;
    private String cpf;
    private String senha;
    private boolean situacao;
    private boolean bloqueio;
 
    public Cliente(String matricula, String cpf, String nome, String telefone, String senha, String email) {
        super(nome, email,telefone);
        this.matricula = matricula;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
}
