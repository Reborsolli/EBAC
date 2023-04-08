
public class Principal {

    public static void main (String args[]){

        PessoaFisica pf = new PessoaFisica();
        pf.setCod(1);
        pf.setNome("Renata");
        System.out.println("Cod:" + pf.getCod()+ " nome:" + pf.getNome()+ pf.dadosNome());

        PessoaJuridica pj = new PessoaJuridica();
        pj.setCod(2);
        pj.setNome("RenataTI");
        System.out.println("Cod:" + pj.getCod()+ " nome:" + pj.getNome()+ pj.dadosNome());


    }
}
