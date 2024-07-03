package com.company;

public class Jornal  implements Observer{

    @Override
    public void update(Subject subject) {
        System.out.println("recebendo a noticia via Jornal :" + subject.toString());
    }

}