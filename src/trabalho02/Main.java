/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02;

import trabalho02.iu.IUPrincipal;
import trabalho02.modelo.Aluno;
import trabalho02.modelo.Emprestimo;
import trabalho02.modelo.Professor;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IUPrincipal principal = new IUPrincipal();
        principal.setTitle("Sistema Biblioteca - Trabalho 02 - POO");
        principal.setVisible(true);


        /////////////Utilizando datas --- adicionando dias e comparando datas
//        Emprestimo e = new Emprestimo("11", new Aluno("33", "33", "333", 1, 10));
//        Emprestimo e = new Emprestimo("11" ,new Professor("111", "1111", "Mestre",20));
//        System.out.println(e.getDataEmprestimo().getTime());
//        System.out.println(e.getDataDevolucao().getTime());

      ///Comparação entre datas -- método compareTo()
      ///é invocado de um objeto Calendar e recebe como parametro outro objeto Calendar
      ///se o retorno é 0 ===> as datas sáo iguais
      ///se o retorno é 1 ====> quem invocou tem data superior àquela passada como parametro
      ///se o retorno é -1 ====> quem invocou tem data inferior àquela passada como parametro
      //  System.out.println(e.getDataEmprestimo().compareTo(e.getDataEmprestimo()));
      //  System.out.println(e.getDataDevolucao().compareTo(e.getDataDevolucao()));
      //  System.out.println(e.getDataEmprestimo().compareTo(e.getDataDevolucao()));
      //  System.out.println(e.getDataDevolucao().compareTo(e.getDataEmprestimo()));

    }

}
