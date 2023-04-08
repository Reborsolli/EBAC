public class PessoaFisica extends Dados {


    private String CPF = "403";
    private String sexo ="feminino";


    public String getCPF(String s) {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return  "   CPF=" + CPF +
                " sexo=" + sexo ;
    }

    @Override
    public String dadosNome() {
        return toString();
    }
}
