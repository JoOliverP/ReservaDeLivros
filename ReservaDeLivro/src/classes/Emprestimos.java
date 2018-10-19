package classes;

import java.util.*;

/**
 *
 * @author gabriel
 */
public class Emprestimos {

    private Cliente cliente;
    private Livro livro;
    private Responsavel responsavel;

    private Date dataHoraEmprestimo;
    private Date dataHoraDevolucao;
    private Date dataHoraDevolvido;
    private boolean pendencia;

    public int Emprestimos(Cliente cliente, Livro livro, Responsavel responsavel) {
        if (cliente.getSituacao() || livro.getSituacao()) {
            return 1;
        } else {
            GregorianCalendar gc = new GregorianCalendar();
            Date data = new Date();
            gc.setTime(data);
            gc.add(Calendar.DAY_OF_YEAR, 10);

            this.dataHoraEmprestimo = new Date();
            this.dataHoraDevolucao = gc.getTime();
            this.cliente = cliente;
            this.livro = livro;
            this.responsavel = responsavel;
            this.pendencia = false; //inicia como não devolvido;

            return 0;   //sem erros
        }
    }

    //--
    //renovar emprestimo
    public void renovarEmprestimo() {
        GregorianCalendar gc = new GregorianCalendar();
        Date data = new Date();
        gc.setTime(data);
        gc.add(Calendar.DAY_OF_YEAR, 5);
        setDataHoraDevolucao(gc.getTime());
    }

    //devolver
    public void devolverLivro() {
        Date data = new Date();
        setDataHoraDevolvido(data);
        setPendencia(true); //marcando como devolvido
        livro.setSituacao(true);
        cliente.setSituacao(true);
    }

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

    public boolean getPendencia() {
        return pendencia;
    }

    public void setPendencia(boolean pendencia) {
        this.pendencia = pendencia;
    }

    public Date getDataHoraEmprestimo() {
        return dataHoraEmprestimo;
    }

    public void setDataHoraEmprestimo(Date dataHoraEmprestimo) {
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }

    public Date getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(Date dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public Date getDataHoraDevolvido() {
        return dataHoraDevolvido;
    }

    public void setDataHoraDevolvido(Date dataHoraDevolvido) {
        this.dataHoraDevolvido = dataHoraDevolvido;
    }

}
