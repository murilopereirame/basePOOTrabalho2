/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02.modelo;

import java.lang.IllegalArgumentException;
import java.io.Serializable;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Usuario implements Serializable {
    protected String codUsuario;
    protected String nome;
    protected int diasEmprestimo;//numero de dias permitidos para emprestimo

    public Usuario(String codUsuario, String nome, int diasEmprestimo) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.diasEmprestimo = diasEmprestimo;
    }

    public int getDiasEmprestimo() {
        return diasEmprestimo;
    }

    public void setDiasEmprestimo(int diasEmprestimo) {
        if(diasEmprestimo > 0 )
            this.diasEmprestimo = diasEmprestimo;
        else
            throw new IllegalArgumentException("Os dias devem ser maiores do que zero!");
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        if(codUsuario != "")
            this.codUsuario = codUsuario;
        else
            throw new IllegalArgumentException("O códig")
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}
