
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
        Disciplina anatomiaAnimal = new Disciplina(1001, "anatomiaAnimal", 10);
        Disciplina anatomiaComparada = new Disciplina(1002, "anatomiaComparada", 10);
        Disciplina anatomiaHumana = new Disciplina(1003, "anatomiaHumana", 10);
        Disciplina bioclimatologiaHidrologia = new Disciplina(1004, " bioclimatologiaHidrologia ", 10);
        Disciplina bioestatística = new Disciplina(1005, " bioestatística ", 10);
        Disciplina biofísicaAplicada = new Disciplina(1006, "biofísicaAplicada ", 10);
        Disciplina biogeografiaGeoprocessamento = new Disciplina(1007, "biogeografiaGeoprocessamento", 10);
        Disciplina bioinformática = new Disciplina(1008, "bioinformática", 10);
        Disciplina biologiaCelular = new Disciplina(1009, "biologiaCelular", 10);
        Disciplina biologiaMolecular = new Disciplina(1010, "biologiaMolecular", 10);

        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(anatomiaAnimal);
        disciplinas.add(anatomiaComparada);
        disciplinas.add(anatomiaHumana);
        disciplinas.add(bioclimatologiaHidrologia);
        disciplinas.add(bioestatística);
        disciplinas.add(biofísicaAplicada);
        disciplinas.add(biogeografiaGeoprocessamento);
        disciplinas.add(bioinformática);
        disciplinas.add(biologiaCelular);
        disciplinas.add(biologiaMolecular);

        Curso curso = new Curso(1001, "Biologia", disciplinas);

        Aluno estefhany = new Aluno(1001, "estefhany", "101", curso, disciplinas);
        disciplinas.add(biologiaCelular);
        disciplinas.add(anatomiaAnimal);
        disciplinas.add(anatomiaComparada);
        disciplinas.add(anatomiaHumana);
        disciplinas.add(bioclimatologiaHidrologia);

        Aluno eduarda = new Aluno(1002, "eduarda", "102", curso, disciplinas);
        disciplinas.add(bioclimatologiaHidrologia);
        disciplinas.add(bioestatística);
        disciplinas.add(biofísicaAplicada);
        disciplinas.add(biogeografiaGeoprocessamento);
        disciplinas.add(bioinformática);

        Aluno luiza = new Aluno(1003, "luiza", "103", curso, disciplinas);
        disciplinas.add(bioestatística);
        disciplinas.add(biofísicaAplicada);
        disciplinas.add(biogeografiaGeoprocessamento);
        disciplinas.add(bioinformática);
        disciplinas.add(anatomiaAnimal);

        Aluno kaiane = new Aluno(1004, "kaiane", "104", curso, disciplinas);
        disciplinas.add(bioclimatologiaHidrologia);
        disciplinas.add(bioestatística);
        disciplinas.add(biofísicaAplicada);
        disciplinas.add(biogeografiaGeoprocessamento);
        disciplinas.add(bioinformática);

    }
}
