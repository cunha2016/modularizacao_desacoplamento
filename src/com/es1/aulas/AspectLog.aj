package com.es1.aulas;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;


public aspect AspectLog {
/*
    //
    log.registaLog("Acesso ao getNome");

    //
    log.registaLog("Acesso ao getMorada");

    //
    log.registaLog("Acesso ao setNome");

    //
    log.registaLog("Acesso ao setMorada");*/


    @Before("execution(* Pessoa.set*(..))")
    public void call1(){
        System.out.println("Alterei o objeto");

    }

}
