package com.company;

public class Demo {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("B", false);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.create(cliente.getClasseB());

    }

    private static Fabrica getFabrica(Cliente cliente) {
        if (cliente.isClasseA()) {
            return new ClasseA();
        } else {
            return new ClasseB();
        }
    }
}

