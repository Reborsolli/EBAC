package br.com.reborsolli.dao;

import br.com.reborsolli.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {


        public Boolean cadastrar(Cliente cliente);

        public void excluir ( long cpf);

        public void  alterar ( Cliente cliente);

        public Cliente consultar (long cpf);

        public Collection <Cliente> buscarTodos();

    }

