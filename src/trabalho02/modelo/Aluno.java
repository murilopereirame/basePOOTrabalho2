/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02.modelo;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Aluno extends Usuario {
    protected String curso;
    protected int ano;
    
    public Aluno(String codUsuario, String nome, String curso, int ano, int dias) {
        super(codUsuario, nome, dias); //emprestimo por X dias
        this.curso = curso;
        this.ano = ano;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public String getCurso(){
        return this.curso;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return this.ano;
    }
}
