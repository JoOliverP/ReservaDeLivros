package classes;

import java.util.Date;

/**
 *
 * @author gabriel
 */
public class Emprestimos {

    private Cliente cliente;
    private Livro livro;
    private Responsavel responsavel;

    private Date dataHoraSaida;
    private Date dataDevolucao;
    private Date dataHoraDevolucao;
    private boolean pendencia;

    public Emprestimos(Cliente cliente, Livro livro, Responsavel responsavel, Date dataHoraSaida, Date dataDevolucao) {
        this.cliente = cliente;
        this.livro = livro;
        this.responsavel = responsavel;
        this.dataHoraSaida = dataHoraSaida;
        this.dataDevolucao = dataDevolucao;
        this.pendencia = false; //inicia como não devolvido;
    }
    
    //--
    //renovar emprestimo
    //devolver
    //bloquear 
    //--

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Date getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Date dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(Date dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public boolean isPendencia() {
        return pendencia;
    }

    public void setPendencia(boolean pendencia) {
        this.pendencia = pendencia;
    }
    
}
