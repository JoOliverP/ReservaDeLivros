package classes;

/**
 *
 * @author gabriel
 */
public class Cliente extends Pessoa{
    private String cpf;
    private String senha;
    private boolean situacao;

    public Cliente(String cpf, String nome, String sobrenome, String telefone, String senha, String email) {
        super(email,nome,sobrenome,telefone);
        this.cpf = cpf;
        this.senha = senha;
        this.situacao = true;   //inicia como liberado
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

    public boolean isSituacao() {
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
