/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Biblioteca {
    private Config configuracoes;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.usuarios = new ArrayList<Usuario>();
        this.emprestimos = new ArrayList<Emprestimo>();
        this.livros = new ArrayList<Livro>();
        this.configuracoes = new Config();
    }

    public Config getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Config configuracoes) {
        this.configuracoes = configuracoes;
    }

    public void addAluno(String codUsuario, String nome, String curso, int ano){
        Aluno aluno = new Aluno(codUsuario, nome, curso, ano, configuracoes.getDiasAluno());
        this.usuarios.add(aluno);
    }

    public void addProfessor(String codUsuario, String nome, String titulacao){
        Professor professor = new Professor(codUsuario, nome, titulacao, configuracoes.getDiasProfessor());
        this.usuarios.add(professor);
    }

    public void addLivro(String codLivro, String nome, int ano) {
        Livro livro = new Livro(codLivro, nome, ano);
        this.livros.add(livro);
    }

    public Livro buscaLivro(String codLivro) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getCodLivro().equals(codLivro)) {
                return livros.get(i);
            }
        }
        return null;
    }

    public void salvarLivros() {
        String nomeArquivo = configuracoes.getArquivoLivros();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            //oos.writeObject(this.livros);
            //ou salvar livro a livro
            oos.writeInt(livros.size());
            for (int i = 0; i < livros.size(); i++) {
                oos.writeObject(livros.get(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void recuperarLivros() {
        String nomeArquivo = configuracoes.getArquivoLivros();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            ///this.livros = (ArrayList<Livro>) ois.readObject();
            ///ou ler livro por livro do arquivo -- depende de como salvou
            this.livros.clear();
            int numLivros = ois.readInt();
            for (int i=0; i<numLivros; i++){
                Livro livro = (Livro) ois.readObject();
                livros.add( livro );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
