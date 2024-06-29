package com.company;

public class ClasseA extends Fabrica{

    @Override
    Carro retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new BMW("218I", "Branco", "Flex");
        } else {
            return null;
        }
    }
}
