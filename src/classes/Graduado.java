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
public class Graduado extends Estudante{
    
    private int anoConclusao;
    private int anoColacaoDeGrau;
    private int numeroDiploma;
    
    public Graduado(){
        
    }

    public Graduado(int anoConclusao, int anoColacaoDeGrau, int numeroDiploma, int matricula, String curso, String campus, String nome, String endereco, String telefone, String email) {
        super(matricula, curso, campus, nome, endereco, telefone, email);
        this.anoConclusao = anoConclusao;
        this.anoColacaoDeGrau = anoColacaoDeGrau;
        this.numeroDiploma = numeroDiploma;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public int getAnoColacaoDeGrau() {
        return anoColacaoDeGrau;
    }

    public void setAnoColacaoDeGrau(int anoColacaoDeGrau) {
        this.anoColacaoDeGrau = anoColacaoDeGrau;
    }

    public int getNumeroDiploma() {
        return numeroDiploma;
    }

    public void setNumeroDiploma(int numeroDiploma) {
        this.numeroDiploma = numeroDiploma;
    }
    
    
    
}
