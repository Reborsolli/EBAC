package com.company;

public abstract class Fabrica {


    public Carro create(String requestedGrade) {
        Carro carro = retrieveCar(requestedGrade);
        carro = prepareCar(carro);
        return carro;
    }
    private Carro prepareCar(Carro carro){
        carro.startEngine();
        carro.Cor();
        carro.Combustivel();
        carro.mechanicCheck();

        return carro;
    }
    abstract Carro retrieveCar(String requestedGrade);
}
