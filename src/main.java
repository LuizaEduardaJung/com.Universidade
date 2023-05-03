
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class main {
    
public static void main(String[] args){
    Disciplina algoritmos = new Disciplina(1001, "Algoritmos", 10);
    Disciplina programacao_1 = new Disciplina(1002, "Programação 1", 10);
    Disciplina programacao_2 = new Disciplina(1003, "Programção 2", 10);
    Disciplina linguagensFormais = new Disciplina(1004, "Linguagens Formais", 10);
    Disciplina arquitetura = new Disciplina(1005, "Arquitetura", 10);
    Disciplina inteligenciaArtificial = new Disciplina(1006, "Inteligencia Artificial", 10);
    Disciplina desenvolvimentoWeb = new Disciplina(1007, "Desenvolvimento Web", 10);
    Disciplina sistemas = new Disciplina(1008, "Sistemas", 10);
    Disciplina gestao = new Disciplina(1009, "Gestão", 10);
    Disciplina probabilidade = new Disciplina(1010, "Probabilidade", 10);
    
    List<Disciplina> disciplinas = new ArrayList<>();
    disciplinas.add(algoritmos);
    disciplinas.add(programacao_1);
    disciplinas.add(programacao_1);
    disciplinas.add(linguagensFormais);
    disciplinas.add(arquitetura);
    disciplinas.add(inteligenciaArtificial);
    disciplinas.add(desenvolvimentoWeb);
    disciplinas.add(sistemas); 
    disciplinas.add(gestao);
    disciplinas.add(probabilidade);
    
    Curso curso = new Curso(1001, "Ciência da Computação", disciplinas);
    
    Aluno luiza = new Aluno(1001, "Luíza", "101", curso, disciplinas);
    disciplinas.add(algoritmos);
    disciplinas.add(arquitetura);
    disciplinas.add(inteligenciaArtificial);
    disciplinas.add(desenvolvimentoWeb);
    disciplinas.add(programacao_1);
    
    
    Aluno kaiane = new Aluno(1002, "Kaiane", "102", curso, disciplinas);
    disciplinas.add(probabilidade);
    disciplinas.add(arquitetura);
    disciplinas.add(algoritmos);
    disciplinas.add(desenvolvimentoWeb);
    disciplinas.add(gestao);
    
    Aluno estefhany = new Aluno(1003, "Estéfhany", "103", curso, disciplinas);
    disciplinas.add(inteligenciaArtificial);
    disciplinas.add(linguagensFormais);
    disciplinas.add(arquitetura);
    disciplinas.add(desenvolvimentoWeb);
    disciplinas.add(gestao);
    
    Aluno eduarda = new Aluno(1004, "Eduarda", "104", curso, disciplinas);
    disciplinas.add(programacao_1);
    disciplinas.add(programacao_2);
    disciplinas.add(algoritmos);
    disciplinas.add(probabilidade);
    disciplinas.add(sistemas);
    
    
    Aluno tauhan = new Aluno(1005, "Tauhan", "105", curso, disciplinas);
    disciplinas.add(inteligenciaArtificial);
    disciplinas.add(programacao_1);
    disciplinas.add(programacao_1);
    disciplinas.add(gestao);
    disciplinas.add(probabilidade);
    
    Aluno gean = new Aluno(1005, "Gean", "106", curso, disciplinas);
    disciplinas.add(algoritmos);
    disciplinas.add(programacao_1);
    disciplinas.add(programacao_1);
    disciplinas.add(gestao);
    disciplinas.add(probabilidade);
  
    
    
    
    



    
}

    
    
}
