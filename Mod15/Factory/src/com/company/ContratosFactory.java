package com.company;

public class ContratosFactory  extends  Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("B".equals(requestedGrade)) {
            return new Corolla(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
