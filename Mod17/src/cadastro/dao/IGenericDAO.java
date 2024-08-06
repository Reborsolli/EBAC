package cadastro.dao;

import cadastro.domain.Persistente;

import java.util.Collection;

public interface IGenericDAO<T extends Persistente> {

    public Boolean cadastrar(T entity);

    public Boolean excluir(Long valor);

    Boolean excluir(T entity);

    public Boolean alterar(T entity);

    public T consultar(Long valor);

    public Collection<T> buscarTodos();
}
