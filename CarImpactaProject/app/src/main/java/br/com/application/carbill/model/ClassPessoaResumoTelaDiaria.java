package br.com.application.carbill.model;

public class ClassPessoaResumoTelaDiaria {
    private String nome;
    private int idPessoa;
    private boolean ida, volta;

    public ClassPessoaResumoTelaDiaria(String nome, int id_pessoa) {
        this.nome = nome;
        this.idPessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public boolean isIda() {
        return ida;
    }

    public void setIda(boolean ida) {
        this.ida = ida;
    }

    public boolean isVolta() {
        return volta;
    }

    public void setVolta(boolean volta) {
        this.volta = volta;
    }
}
