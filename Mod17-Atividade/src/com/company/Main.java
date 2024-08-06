package com.company;

import com.company.dao.CarroDAO;
import com.company.domain.Carro;
import com.company.domain.HondaCivic;
import com.company.domain.ToyotaCorolla;

public class Main {
    public static void main(String[] args) {
        CarroDAO carroDAO = new CarroDAO();

        Carro carro1 = new HondaCivic("Honda Civic", "123456789", "2020", "Preto");
        Carro carro2 = new ToyotaCorolla("Toyota Corolla", "987654321", "2019", "Branco");

        carroDAO.cadastrar(carro1);
        carroDAO.cadastrar(carro2);

        // Consultar um carro
        Carro carroConsultado = carroDAO.consultar(123456789L);
        System.out.println("Carro consultado: " + carroConsultado);

        // Alterar um carro
        Carro carroAlterado = new HondaCivic("Honda Civic", "123456789", "2021", "Azul");
        carroDAO.alterar(carroAlterado);

        // Consultar novamente para ver as mudanças
        carroConsultado = carroDAO.consultar(123456789L);
        System.out.println("Carro consultado após alteração: " + carroConsultado);

        // Excluir um carro
        carroDAO.excluir(987654321L);

        // Listar todos os carros
        for (Carro carro : carroDAO.buscarTodos()) {
            System.out.println(carro);
        }
    }
}