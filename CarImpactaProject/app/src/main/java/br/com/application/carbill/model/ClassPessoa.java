package br.com.application.carbill.model;

public class ClassPessoa {
    private String nome, sobrenome, apelido, telefone, rua, bairro;

    int numero;
    int id;
    private double dividaTotal = 0.0f;

    private double valorPorCorrida = 0.0f;

    public ClassPessoa() {
    }

    public ClassPessoa(int id, String nome, String sobrenome, String apelido) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
    }

    public ClassPessoa(String nome, String sobrenome, String apelido, String telefone, String rua, String bairro, int numero, double valorPorCorrida) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.valorPorCorrida = valorPorCorrida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorPorCorrida() {
        return valorPorCorrida;
    }

    public void setValorPorCorrida(double valorPorCorrida) {
        this.valorPorCorrida = valorPorCorrida;
    }

    public double getDividaTotal() {
        return dividaTotal;
    }

    public void setDividaTotal(double dividaTotal) {
        this.dividaTotal = dividaTotal;
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

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public String getTelefone() {
        return telefone;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNumero() {
        return numero;
    }
}
