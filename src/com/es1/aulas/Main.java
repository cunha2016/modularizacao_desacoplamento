package com.es1.aulas;

public class Main {

    public static void main(String[] args) {
        CodigoPostal cp = new CodigoPostalEvoluido("3510-000","Viseu");
	    Pessoa p = new Pessoa("Maria","Viseu", cp);

	    p.setNome("João");
        p.setMorada("Porto");

	    System.out.println("Nome: " + p.getNome());
    }
}
