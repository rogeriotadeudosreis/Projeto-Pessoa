/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author roger
 */
public class Estudante extends Pessoa{
    
    private int matricula;
    private String curso;
    private String campus;

    
    public Estudante() {
       
    }   

    public Estudante(int matricula, String curso, String campus, String nome, String endereco, String telefone, String email) {
        
        super(nome, endereco, telefone, email);
        this.matricula = matricula;
        this.curso = curso;
        this.campus = campus;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }    
    
}
