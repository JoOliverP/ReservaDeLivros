package classes;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Emprestimos {

    private Cliente cliente;
    private Livro livro;
    private String responsavel;

    private Date dataHoraEmprestimo;
    private Date dataHoraDevolucao;
    private Date dataHoraDevolvido;
    private String id;
    private boolean pendencia;

    public Emprestimos(){
        //construtor padrão
    }
      
    public void FazerEmprestimo(String senha, String matricula) {
        if ((matricula.equals(cliente.getMatricula())) && (senha.equals(cliente.getSenha()))) {
            if (cliente.getSituacao() || livro.getSituacao()) {
                JOptionPane.showMessageDialog(null, "Cliente ou Livro não podem efetuar operação!");
            }
            else {
                Random n = new Random();
                GregorianCalendar gc = new GregorianCalendar();
                Date data = new Date();
                gc.setTime(data);
                gc.add(Calendar.DAY_OF_YEAR, 10);

                this.dataHoraEmprestimo = new Date();
                this.dataHoraDevolucao = gc.getTime();
                this.cliente.setSituacao(true);
                this.livro.setSituacao(true);
                this.pendencia = true; //inicia como não devolvido;
                this.id = matricula+""+n.nextInt(1024);
                    
                JOptionPane.showMessageDialog(null, "Feito!");   //sem erros
            }
        } else {
            JOptionPane.showMessageDialog(null, "Matrícula ou senha Incorretos!");
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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
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
