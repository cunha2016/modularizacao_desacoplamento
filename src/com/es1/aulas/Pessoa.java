package com.es1.aulas;

public class Pessoa {

    private String nome;
    private String morada;
    private ICodigoPostal codigoPostalGeral;

    ILog log = new Log();

    public Pessoa(String nome, String morada, CodigoPostalGeral codigoPostalGeral) {
        this.nome = nome;
        this.morada = morada;
        this.codigoPostalGeral = codigoPostalGeral;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setNome(String nome) {

        this.nome = nome;
        //System.out.println("Alterei o objeto");
    }

    public void setMorada(String morada) {

        this.morada = morada;
        //System.out.println("Alterei a classe");
    }

    public CodigoPostalGeral getCodigoPostalGeral() {
        return codigoPostalGeral;
    }
}
