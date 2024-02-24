package br.com.application.carbill.model;

public class ClassPessoaResumoTelaInical {
    private String nome;
    private double Total;
    private int idPessoa;
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }
    public double getTotal() {
        return Total;
    }
    public ClassPessoaResumoTelaInical(int idPessoa, String nome, double total) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.Total = total;
    }
}
