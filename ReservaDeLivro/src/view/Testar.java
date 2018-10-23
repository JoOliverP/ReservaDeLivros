
package view;
import classes.*;

/**
 *
 * @author gabriel
 */
public class Testar {
    
    public static void main(String[] args) {
       Livro livro[] = new Livro[3];    //array para conter três livros
       
       livro[0] = new Livro("Algoritmos",2017,"Aprenda como construir algoritmos");
       livro[1] = new Livro("Cálculo 1",2015,"Cálculo 1 para graduação");
       livro[2] = new Livro("Política",2015,"Mundo em decadência");
       
       Cliente cliente[] = new Cliente[3];
       
       cliente[0] = new Cliente("20180001","089.897.776-67","Maria","Zinha","91 98888-9999","XxYy18","mariaZinha@bad.com");
       cliente[1] = new Cliente("20180002","082.892.772-62","João","Zinho","91 97777-9999","XaYl19","joaoZinho@bad.com");
       cliente[2] = new Cliente("20180003","083.893.736-63","Jubileu","Mj","91 93333-9999","Oxoy15","jubileuMj@bad.com");
       
       Responsavel responsavel = new Responsavel("Joana", "sobrenome", "91 98989-7878", "joanaSobrenome@bad.com");
       
       Emprestimos emprestimos[] = new Emprestimos[10];
       
       
       
    }
}
