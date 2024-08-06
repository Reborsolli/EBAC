package cadastro.dao;

import cadastro.domain.Persistente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {


    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getTipoClasse();

    public abstract void atualizarDados(T entity, T entityCadastrado);

    public GenericDAO() {
        this.map = new HashMap<>();
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }

    }


    public Boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno.containsKey(entity.getCodigo())) {
            return false;
        }
        mapaInterno.put(entity.getCodigo(), entity);
        return true;
    }

    @Override
    public Boolean excluir(Long codigo) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno != null && mapaInterno.containsKey(codigo)) {
            mapaInterno.remove(codigo);
            return true;
        }
        return false;
    }

    @Override
    public Boolean alterar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        T objetocadastrado = mapaInterno.get(entity.getCodigo());
        if (objetocadastrado != null) {
            atualizarDados(entity, objetocadastrado);
            return true;
        }
        return false;
    }

    @Override
    public T consultar(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.get(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return null;
    }
}
