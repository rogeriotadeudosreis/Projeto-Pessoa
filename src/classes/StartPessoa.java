
package classes;

import javax.swing.JOptionPane;


public class StartPessoa {
    
    public static void imprimirDadosPessoa(Pessoa objeto){
        
        System.out.println("***** Impressão dos Dados Pessoais *****");
        System.out.println("Nome:                    " + objeto.getNome());
        System.out.println("Endereço:                " + objeto.getEndereco());
        System.out.println("Telefone:                " + objeto.getTelefone());
        System.out.println("E-mail:                  " + objeto.getEmail());
        
    }
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Rogério Tadeu dos Reis/pessoa", "Rua 1", "55-62-98591-5534", "rogerio.rtr46@gmail.com");
        
        Estudante estudante = new Estudante(141252, "ADS", "Setor Leste Universitário", "Rogério Tadeu dos Reis/estudante", "Rua 2", "55-62-98591-5537", "rogerio.rtr46@gmail.com");
                
        Trabalhador trabalhador = new Trabalhador("Analista de Sistemas", "Gerência de Projeto", 5000.00f, "Rogério Tadeu dos Reis/trabalhador", "Rua 3", "55-62-98591-5534", "rogerio.rtr46@gmail.com");
                   
        Graduado graduado = new Graduado(2015, 2020, 256, 100354, "ADS", "Leste Universitário", "Clodoaldo Gomes/graduado", "Rua 7", "55-62-1111-2233", "clodoaldo.gomes@gmail.com");
                
        imprimirDadosPessoa(pessoa);        
        System.out.println("");
        
        imprimirDadosPessoa(estudante);
        System.out.println("Matrícula:               " + estudante.getMatricula());
        System.out.println("Curso:                   " + estudante.getCurso());
        System.out.println("Campus:                  " + estudante.getCampus());        
        System.out.println("");
        
        imprimirDadosPessoa(trabalhador);
        System.out.println("Função:                  " + trabalhador.getFuncao());
        System.out.println("Departamento:            " + trabalhador.getDepartamento());
        System.out.println("Salário:                 " + trabalhador.getSalario());        
        System.out.println("");
        
        imprimirDadosPessoa(graduado);
        System.out.println("Matrícula:               " + graduado.getMatricula());
        System.out.println("Curso:                   " + graduado.getCurso());
        System.out.println("Campus:                  " + graduado.getCampus());  
        System.out.println("Ano de conclusão:        " + graduado.getAnoConclusao());
        System.out.println("Ano da colação de grau:  " + graduado.getAnoColacaoDeGrau());
        System.out.println("Número do diploma        " + graduado.getNumeroDiploma());        
        System.out.println(""); 
    }
    
}
