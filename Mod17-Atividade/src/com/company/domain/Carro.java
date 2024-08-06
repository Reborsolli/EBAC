package com.company.domain;


import java.util.Objects;

public abstract class Carro implements Persistente {
    private String modelo;
    private Long codigo;
    private Integer ano;
    private String cor;

    public Carro(String modelo, String codigo, String ano, String cor) {
        this.modelo = modelo;
        this.codigo = Long.valueOf(codigo.trim());
        this.ano = Integer.valueOf(ano.trim());
        this.cor = cor;
    }

    // Getters
    public String getModelo() {
        return modelo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(codigo, carro.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", codigo=" + codigo +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }
}
