
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

    public static void main(String[] args) {
        Disciplina facas = new Disciplina(1001, "facas", 10);
        Disciplina iteligenciaDaAlimentacao = new Disciplina(1002, "iteligenciaDaAlimentacao", 10);
        Disciplina asados = new Disciplina(1003, "asados", 10);
        Disciplina frituras = new Disciplina(1004, "frituras", 10);
        Disciplina legumes = new Disciplina(1005, "legumes", 10);
        Disciplina queimaduras = new Disciplina(1006, "queimaduras", 10);
         Disciplina historiaDaAlimentacao = new Disciplina(1007, "historia da alimentação", 10);
         Disciplina historiaDaAlimentacao_2 = new Disciplina(1008, "historia da alimentação_2", 10);
         Disciplina historiaDaAlimentacao_3 = new Disciplina(1007, "historia da alimentação_2", 10);
          Disciplina queimaduras_2 = new Disciplina(1006, "queimaduras_2", 10);
          
        List<Disciplina> disciplina = new ArrayList<>();
        disciplina.add(asados);
        disciplina.add(facas);
        disciplina.add(queimaduras);
        disciplina.add(frituras);
        disciplina.add(queimaduras_2);

        Curso curso = new Curso(1005, "culinaria", disciplina);
        
        Aluno Eduarda = new Aluno(1005, "eduarda", "101",curso,disciplina);
          disciplina.add(facas);
        disciplina.add(iteligenciaDaAlimentacao);
        disciplina.add(asados);
        disciplina.add(historiaDaAlimentacao_3);
        disciplina.add(historiaDaAlimentacao_2);
        
        Aluno Estefhany = new Aluno(1003, "Estefhany", "102",curso,disciplina);
          disciplina.add(facas);
        disciplina.add(iteligenciaDaAlimentacao);
        disciplina.add(asados);
        disciplina.add(historiaDaAlimentacao_2);
        disciplina.add(legumes);
        
        Aluno Luiza = new Aluno(1002, "Luiza", "103",curso,disciplina);
          disciplina.add(facas);
        disciplina.add(iteligenciaDaAlimentacao);
        disciplina.add(queimaduras);
        disciplina.add(frituras);
        disciplina.add(legumes);
        
        
        Aluno Kaiane = new Aluno(1004, "kaiane", "104",curso,disciplina);
          disciplina.add(facas);
        disciplina.add(queimaduras);
        disciplina.add(queimaduras_2);
        disciplina.add(frituras);
        disciplina.add(legumes);
        
        Aluno Tauhan = new Aluno(1006, "Tauhan", "106",curso,disciplina);
          disciplina.add(facas);
        disciplina.add(iteligenciaDaAlimentacao);
        disciplina.add(asados);
        disciplina.add(frituras);
        disciplina.add(legumes);

        Aluno Gean = new Aluno(1007, "gean", "107",curso,disciplina);
          disciplina.add(facas);
        disciplina.add(iteligenciaDaAlimentacao);
        disciplina.add(historiaDaAlimentacao_2);
        disciplina.add(frituras);
        disciplina.add(legumes);
    
}
}
