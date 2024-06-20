/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

/**
 *
 * @author User
 */

import domain.Cliente;


public interface IClienteDAO {
    
       public Boolean cadastrar(Cliente cliente);

        public void excluir ( long cpf);

        public Boolean alterar ( Cliente cliente);

        public Cliente consultar (long cpf);

   

}
