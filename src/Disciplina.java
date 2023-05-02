/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class Disciplina {
   private int codigo;
   private String nome;
   private int numeroDeVagas;

    public Disciplina(int codigo, String nome, int numeroDeVagas) {
        this.codigo = codigo;
        this.nome = nome;
        this.numeroDeVagas = numeroDeVagas;
    }

    public Disciplina() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeVagas() {
        return numeroDeVagas;
    }

    public void setNumeroDeVagas(int numeroDeVagas) {
        this.numeroDeVagas = numeroDeVagas;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "codigo=" + codigo + ", nome=" + nome + ", numeroDeVagas=" + numeroDeVagas + '}';
    }
   
   
}
