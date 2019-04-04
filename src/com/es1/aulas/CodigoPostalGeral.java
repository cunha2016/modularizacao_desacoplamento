package com.es1.aulas;

public abstract class CodigoPostalGeral {
    String codigoPostal;
    String localidade;

    public CodigoPostalGeral(String codigoPostal, String localidade) {
        this.codigoPostal = codigoPostal;
        this.localidade = localidade;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getLocalidade() {
        return localidade;
    }
}
