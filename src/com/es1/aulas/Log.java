package com.es1.aulas;

public class Log implements ILog{
    @Override
    public  void registaLog(String msg){
        System.out.println(msg);
    }

}
