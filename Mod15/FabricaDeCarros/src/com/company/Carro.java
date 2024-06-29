package com.company;

public abstract class Carro {

    private String modelo;
    private String color;
    private String combustivel;

    public Carro(String modelo, String color, String combustivel) {
        this.modelo = modelo;
        this.color = color;
        this.combustivel = combustivel;
    }

    public void startEngine(){
        System.out.println( " a Marca do Carro é : " + getClass().getSimpleName());
        System.out.println( " O modelo é " + modelo);
    }
    public void Cor(){
        System.out.println("A cor " + color.toLowerCase() );
    }
    public void Combustivel() {
        System.out.println("O combustivel " + combustivel.toLowerCase());
    }
    public void mechanicCheck(){
        System.out.println("O carro foi revisado é esta pronto para Venda");
    }
}
