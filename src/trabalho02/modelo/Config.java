/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02.modelo;

import java.io.Serializable;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Config implements Serializable{
    private String arquivoLivros = ".\\livros.dat";
    private String arquivoUsuarios = ".\\usuarios.dat";
    private String arquivoEmprestimos = ".\\emprestimos.dat";
    private int diasAluno = 10;
    private int diasProfessor = 20;

    public String getArquivoEmprestimos() {
        return arquivoEmprestimos;
    }

    public void setArquivoEmprestimos(String arquivoEmprestimos) {
        this.arquivoEmprestimos = arquivoEmprestimos;
    }

    public String getArquivoLivros() {
        return arquivoLivros;
    }

    public void setArquivoLivros(String arquivoLivros) {
        this.arquivoLivros = arquivoLivros;
    }

    public String getArquivoUsuarios() {
        return arquivoUsuarios;
    }

    public void setArquivoUsuarios(String arquivoUsuarios) {
        this.arquivoUsuarios = arquivoUsuarios;
    }

    public int getDiasAluno() {
        return diasAluno;
    }

    public void setDiasAluno(int diasAluno) {
        this.diasAluno = diasAluno;
    }

    public int getDiasProfessor() {
        return diasProfessor;
    }

    public void setDiasProfessor(int diasProfessor) {
        this.diasProfessor = diasProfessor;
    }

}
