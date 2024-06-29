package com.company;

public class ClasseB  extends  Fabrica{

    Carro retrieveCar(String requestedGrade) {
        if ("B".equals(requestedGrade)) {
        return new Chevrolet("Celta", "Preto", "Gasolina");
    } else {
        return null;
    }
}
}


