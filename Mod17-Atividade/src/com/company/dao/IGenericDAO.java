package com.company.dao;

import java.util.Collection;

public interface IGenericDAO<T> {
    Boolean cadastrar(T entity);

    Boolean excluir(Long codigo);

    Boolean alterar(T entity);

    T consultar(Long valor);

    Collection<T> buscarTodos();
}