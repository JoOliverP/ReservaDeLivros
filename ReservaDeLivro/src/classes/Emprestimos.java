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
    private String id;
    private boolean pendencia;

    public Emprestimos(Cliente cliente, Livro livro, Responsavel responsavel) {
        this.cliente = cliente;
        this.livro = livro;
        this.responsavel = responsavel;
    }

    public String FazerEmprestimo(String senha, String matricula) {
        if ((matricula.equals(cliente.getMatricula())) && (senha.equals(cliente.getSenha()))) {
            if (cliente.getSituacao() || livro.getSituacao()) {
                return "Cliente ou Livro não podem efetuar operação!";
            } else {
                GregorianCalendar gc = new GregorianCalendar();
                Date data = new Date();
                gc.setTime(data);
                gc.add(Calendar.DAY_OF_YEAR, 10);

                this.dataHoraEmprestimo = new Date();
                this.dataHoraDevolucao = gc.getTime();
                this.cliente = cliente;
                this.cliente.setSituacao(true);
                this.livro = livro;
                this.livro.setSituacao(true);
                this.responsavel = responsavel;
                this.pendencia = true; //inicia como não devolvido;
                this.id = matricula+"1";

                return "Feito!";   //sem erros
            }
        } else {
            return "Matrícula ou senha Incorretos!";
        }
    }

    //--
    //renovar emprestimo
    public String renovarEmprestimo(String mat, String sen) {
        GregorianCalendar gc = new GregorianCalendar();
        if ((mat.equals(cliente.getMatricula())) && (sen.equals(cliente.getSenha()))) {
            if (!cliente.getBloqueio() && getPendencia()) {
                gc.setTime(getDataHoraDevolucao());
                gc.add(Calendar.DAY_OF_YEAR, 5);
                setDataHoraDevolucao(gc.getTime()); //acrescenta cinco dias para data de devolução
                return "Emprestimo renovado.";
            } else {
                return "Usuário bloqueado ou pendente!";
            }
        } else {
            return "Matrícula ou senha Incorretos!";
        }
    }

    //devolver
    public String devolverLivro() {
        GregorianCalendar gcDevolvido = new GregorianCalendar();
        GregorianCalendar gcDevolucao = new GregorianCalendar();
        Date data = new Date();
        int dia1, dia2;

        setDataHoraDevolvido(data);
        setPendencia(false); //marcando como devolvido
        livro.setSituacao(false);
        cliente.setSituacao(false);

        gcDevolvido.setTime(getDataHoraDevolvido());
        gcDevolucao.setTime(getDataHoraDevolucao());

        dia1 = gcDevolvido.get(Calendar.DAY_OF_MONTH);
        dia2 = gcDevolucao.get(Calendar.DAY_OF_MONTH);

        if ((dia1 - dia2) > 5) {
            bloquear();
            return "Dias limite estourado! Usuário deve ser bloqueado.";
        }
        
        return "Feito!";
    }

    public void bloquear() {
        cliente.setBloqueio(true);
    }

    public void desbloquear() {
        cliente.setBloqueio(false);
    }

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
}
