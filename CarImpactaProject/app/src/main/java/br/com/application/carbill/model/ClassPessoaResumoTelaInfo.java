package br.com.application.carbill.model;

public class ClassPessoaResumoTelaInfo {

    int id_pessoa;
    String nome;
    String sobrenome;
    String apelido;
    public double valorPorCorrida;
    double dividaTotal;

    public ClassPessoaResumoTelaInfo() {
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getApelido() {
        return apelido;
    }

    public double getValorPorCorrida() {
        return valorPorCorrida;
    }

    public double getDividaTotal() {
        return dividaTotal;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setValorPorCorrida(double valorPorCorrida) {
        this.valorPorCorrida = valorPorCorrida;
    }

    public void setDividaTotal(double dividaTotal) {
        this.dividaTotal = dividaTotal;
    }
}
