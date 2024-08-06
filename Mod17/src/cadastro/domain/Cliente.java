package cadastro.domain;

import java.util.Objects;

public class Cliente implements Persistente {

    private String nome;
    private Long cpf;
    private Integer tel;
    private String cidade;

    public Cliente(String nome, String cpf, String tel, String cidade) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf.trim());
        this.tel = Integer.valueOf(tel.trim());
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return cpf == cliente.cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf);
    }

    @Override
    public String toString() {
        return "cadastro{" +
                "Nome= " + nome +
                ",Cpf= " + cpf +
                ",Telefone= " + tel +
                ",Cidade= " + cidade +
                '}';
    }

    @Override
    public Long getCodigo() {
        return this.cpf;
    }

}


