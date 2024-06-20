/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Cliente;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class ClienteMapDAO implements IClienteDAO {
    


    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())) {
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;

    }



    @Override
    public Boolean alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if(clienteCadastrado!= null){
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setTel(cliente.getTel());
            
            return true;
        }
        return false;
    }

    @Override
    public Cliente consultar(long cpf) {
        return this.map.get(cpf);

    }

    @Override
    public void excluir(long cpf) {
        Cliente clienteCadastrado = map.get(cpf);
        map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
  
        
    }

}


    

