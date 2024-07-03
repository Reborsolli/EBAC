package com.company;

public class Radio implements Observer {


    @Override
    public void update(Subject subject) {
        System.out.println("recebendo a noticia via Radio :" + subject.toString());
    }

}

