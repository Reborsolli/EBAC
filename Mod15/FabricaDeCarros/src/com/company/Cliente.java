package com.company;

public class Cliente {


    private String ClasseB;
    private boolean ClasseA ;

    public Cliente(String classeB, boolean classeA) {
        ClasseB = classeB;
        ClasseA = classeA;
    }

    public boolean isClasseA() {
        return ClasseA;
    }
    public String getClasseB() {
        return ClasseB;
    }


}


