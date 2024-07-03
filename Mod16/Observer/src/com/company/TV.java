package com.company;

public class TV implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("recebendo a noticia via TV :" + subject.toString());
    }
}
