/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.dados;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import trabalho02.modelo.Emprestimo;
import trabalho02.modelo.Livro;
import trabalho02.modelo.Usuario;

/**
 *
 * @author Danilo
 */
public class Database {
    private static Database instancia;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Livro> livros;  

    public Database() {
        this.usuarios = new ArrayList<Usuario>();
        this.emprestimos = new ArrayList<Emprestimo>();
        this.livros = new ArrayList<Livro>();        
    }
    
    public static Database getInstance(){
        if (instancia == null){
            instancia = new Database();
        }
        return instancia;
    }
    
    public void addUsuario(Usuario u){        
        usuarios.add(u);
    }
    
    public void addLivro(Livro l){
        livros.add(l);
    }
    
    public void addEmprestimo(Emprestimo e){
        emprestimos.add(e);
    }
    
    public Usuario getUsuario(String codUsuario){
        for(int i =0; i < usuarios.size(); i++){
            if(usuarios.get(i).getCodUsuario().equals(codUsuario))
                return usuarios.get(i);
        }
        return null;
    }
    
    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
}
