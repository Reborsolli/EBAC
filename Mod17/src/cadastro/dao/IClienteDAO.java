package cadastro.dao;

import cadastro.domain.Cliente;


public interface IClienteDAO extends IGenericDAO<Cliente> {

    Boolean excluir(Long codigo);

}

