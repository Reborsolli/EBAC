package cadastro.domain;

import cadastro.dao.IGenericDAO;

import java.util.Collection;


public class Produto implements IGenericDAO {

    private String produto;
    private Long cod;

    @Override
    public Boolean cadastrar(Persistente entity) {
        return null;
    }

    @Override
    public Boolean excluir(Long valor) {
        return null;
    }

    @Override
    public Boolean excluir(Persistente entity) {
        return null;
    }

    @Override
    public Boolean alterar(Persistente entity) {
        return null;

    }

    @Override
    public Persistente consultar(Long valor) {
        return null;
    }

    @Override
    public Collection buscarTodos() {
        return null;
    }
}