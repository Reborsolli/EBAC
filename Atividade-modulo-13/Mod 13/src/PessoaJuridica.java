public class PessoaJuridica  extends Dados  {

    private String CNPJ ="002" ;
    private String Ramo ="tecnologia";


    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRamo() {
        return Ramo;
    }

    public void setRamo(String ramo) {
        Ramo = ramo;
    }


    public String toString1() {
        return  "CNPJ=" + CNPJ + " Ramo='" + Ramo;
    }

    @Override
    public String dadosNome() {
        return   "  CNPJ=" + CNPJ + " Ramo=" + Ramo;
    }
}
