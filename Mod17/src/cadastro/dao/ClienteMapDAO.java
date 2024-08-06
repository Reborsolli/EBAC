package cadastro.dao;

import cadastro.domain.Cliente;


import java.util.Map;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO {

    public ClienteMapDAO(){
        super();
        Map<Long, Cliente> mapaInterno = this.map.get(getTipoClasse());

    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setTel(entity.getTel());
        entityCadastrado.setCidade(entity.getCidade());


    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public Boolean excluir(Long codigo) {
        Map<Long, Cliente> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno != null && mapaInterno.containsKey(codigo)) {
            mapaInterno.remove(codigo);
            return true;
        }
        return false;
    }

    @Override
    public Boolean excluir(Cliente entity) {
        Map<Long, Cliente> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno != null && mapaInterno.containsKey(entity)) {
            mapaInterno.remove(entity);
            return true;
        }
        return false;
         }
}
    //    public ClienteMapDAO() {
//        super();
//        Map<Long, Cliente> mapaInterno =
//                (Map<Long, Cliente>) SingletonMap.getInstance().getMap().get(getTipoClasse());
//        if (mapaInterno == null) {
//            mapaInterno = new HashMap<>();
//            SingletonMap.getInstance().getMap().put(getTipoClasse(), mapaInterno);
//        }
//    }
//



//
//    @Override
//    public boolean excluir(Long cpf) {
//        if (map.containsKey(cpf)) {
//            map.remove(cpf);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public Boolean alterar(Cliente cliente) {
//        if (this.map.containsKey(cliente.getCpf())) {
//            this.map.put(cliente.getCpf(), cliente);
//            return true;
//        }
//        return false;
//    }
//    @Override
//    public Cliente consultar(long cpf) {
//        return this.map.get(cpf);
//
//    }
//
//    @Override
//    public Collection<Cliente> buscarTodos() {
//        return this.map.values();
//    }

