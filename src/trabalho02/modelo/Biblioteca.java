/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.modelo;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import trabalho02.dados.Database;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Biblioteca {
   private Config configuracoes;
   private Database db = Database.getInstance();

    public Biblioteca() {       
        this.configuracoes = new Config();
    }

    public Config getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Config configuracoes) {
        if(configuracoes == null){
            JOptionPane.showMessageDialog(null, "As configurações não podem ser nulas.", "Entrada inválida.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.configuracoes = configuracoes;
    }

    public void addAluno(String codUsuario, String nome, String curso, int ano){
        if(codUsuario.equals("") || nome.equals("") || curso.equals("")){
            JOptionPane.showMessageDialog(null, "Certifique-se de que todos os campos estão preenchidos.", "Entrada inválida.",  JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(ano <= 0){
            JOptionPane.showMessageDialog(null, "O ano deve ser superior a zero.", "Entrada inválida.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for(int i = 0; i < db.getUsuarios().size(); i++){
            if(db.getUsuarios().get(i).getCodUsuario().equals(codUsuario)){
                JOptionPane.showMessageDialog(null, "Já existe um usuário com esse código.", "Entrada duplicada.", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        Aluno aluno = new Aluno(codUsuario, nome, curso, ano, configuracoes.getDiasAluno());
        db.addUsuario(aluno);
    }

    public void addProfessor(String codUsuario, String nome, String titulacao){
        if(codUsuario.equals("") || nome.equals("") || titulacao.equals("")){
            JOptionPane.showMessageDialog(null, "Certifique-se de que todos os campos estão preenchidos.", "Entrada inválida.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for(int i = 0; i < db.getUsuarios().size(); i++){
            if(db.getUsuarios().get(i).getCodUsuario().equals(codUsuario)){
                JOptionPane.showMessageDialog(null, "Já existe um usuário com esse código.", "Entrada duplicada.", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        Professor professor = new Professor(codUsuario, nome, titulacao, configuracoes.getDiasProfessor());
        db.addUsuario(professor);
    }

    public void addLivro(String codLivro, String nome, int ano) {
        if(codLivro.equals("") || nome.equals("")){
            JOptionPane.showMessageDialog(null, "Certifique-se de que todos os campos estão preenchidos.", "Entrada inválida.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(ano <= 0){
            JOptionPane.showMessageDialog(null, "O ano deve ser superior a zero.", "Entrada inválida.",  JOptionPane.ERROR_MESSAGE);
            return;
        }
        for(int i = 0; i < db.getUsuarios().size(); i++){
            if(db.getUsuarios().get(i).getCodUsuario().equals(codLivro)){
                JOptionPane.showMessageDialog(null, "Já existe um livro com esse código.", "Entrada duplicada.",  JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        Livro livro = new Livro(codLivro, nome, ano);
        db.addLivro(livro);
    }

    

}
