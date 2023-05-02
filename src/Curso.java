
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
public class Curso {
    private int codigo;
    private String nome;
    private List<Diciplina> diciplinas;

    public Curso() {
    }

    public Curso(int codigo, String nome, List<Diciplina> diciplinas) {
        this.codigo = codigo;
        this.nome = nome;
        this.diciplinas = diciplinas;
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

    public List<Diciplina> getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(List<Diciplina> diciplinas) {
        this.diciplinas = diciplinas;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nome=" + nome + ", diciplinas=" + diciplinas + '}';
    }
    
}
