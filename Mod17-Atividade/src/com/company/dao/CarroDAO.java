package com.company.dao;


import com.company.domain.Carro;

import java.util.Collection;

public class CarroDAO extends GenericDAO<Carro> {

    public CarroDAO() {
        super();
    }

    @Override
    public Class<Carro> getTipoClasse() {
        return Carro.class;
    }

    @Override
    public void atualizarDados(Carro entity, Carro entityCadastrado) {
        entityCadastrado.setModelo(entity.getModelo());
        entityCadastrado.setAno(entity.getAno());
        entityCadastrado.setCor(entity.getCor());
    }

    @Override
    public Collection<Carro> buscarTodos() {
        return map.get(getTipoClasse()).values();
    }
}