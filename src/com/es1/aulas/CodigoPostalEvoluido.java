package com.es1.aulas;

public class CodigoPostalEvoluido extends CodigoPostalGeral {
    String pais;

    public CodigoPostalEvoluido(String codigoPostal, String localidade, String pais) {
        super(codigoPostal, localidade);
        this.pais = pais;
    }

}
