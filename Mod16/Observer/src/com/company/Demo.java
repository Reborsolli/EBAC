package com.company;

public class Demo {

    public static void main(String[] args) {
        Jornalista jor = new Jornalista();
        jor.add(new Radio());
        jor.add(new TV());
        jor.add((new Jornal()));
        jor.notifyAll("teste");
    }
}
