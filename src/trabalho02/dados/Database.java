/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.dados;

import trabalho02.modelo.Emprestimo;
import trabalho02.modelo.Livro;
import trabalho02.modelo.Usuario;

/**
 *
 * @author Danilo
 */
public class Database {
    private static Database instancia;
    private Usuario usuarios[];
    private Emprestimo emprestimos[];
    private Livro livros[];
    private static final int MAX_USUARIO = 1000;
    private static final int MAX_EMPRESTIMO = 1000;
    private static final int MAX_LIVRO = 1000;
    private int contU; //contador de usuarios
    private int contE; //contador de emprestimos
    private int contL; //contador de livros

    public Database() {
        this.usuarios = new Usuario[MAX_USUARIO];
        this.emprestimos = new Emprestimo[MAX_EMPRESTIMO];
        this.livros = new Livro[MAX_LIVRO];
        contU = 0;
        contE = 0;
        contL = 0;
    }
    
    public static Database getInstance(){
        if (instancia == null){
            instancia = new Database();
        }
        return instancia;
    }
    
    public void addUsuario(Usuario u){
        if (contU < MAX_USUARIO ){
            usuarios[contU] = u;
            contU++;
        }
    }
    
    public void addLivro(Livro l){
        if (contL < MAX_LIVRO ){
            livros[contL] = l;
            contL++;
        }
    }
}
