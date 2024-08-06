package cadastro;

import cadastro.dao.ClienteMapDAO;
import cadastro.dao.IClienteDAO;
import cadastro.domain.Cliente;

import javax.swing.*;



public class App {


    private static IClienteDAO iClienteDAO;

    public static void main(String args[]) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para Cadastrar, 2 para Consultar , 3 para Excluir, 4 Atualizar, 5 para sair",
                "Consulta", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    " Opção invalida , Digite 1 para Cadastrar, 2 para Consultar , 3 para Atualizar, 4 Excluir, 5 para sair",
                    "Consulta", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone e Cidade ",
                        "cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o cpf",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);

                consultar(dados);

            } else if (isExcluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o cpf",
                        "alterar", JOptionPane.INFORMATION_MESSAGE);

                excluir(dados);

            } else if (isAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente a ser alterado",
                        "Alterar", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }


            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consulta, 3 para excluir, 4 para alteração ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static void consultar(String dados) {
        //Validar se foi passado somente o cpf
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    private static void alterar(String dados) {
        try {
            Long cpfLong = Long.parseLong(dados);
            Cliente cliente = iClienteDAO.consultar(cpfLong);
            if (cliente != null) {
                String dados1 = JOptionPane.showInputDialog(null,
                        "Digite os novos dados do cliente separados por vírgula, conforme exemplo: Nome, Telefone e Cidade ",
                        "Alterar", JOptionPane.INFORMATION_MESSAGE);
                String[] dadosSeparados = dados1.split(",");
                if (dadosSeparados.length == 3) {
                    try {
                        cliente.setNome(dadosSeparados[0]);
                        cliente.setTel(Integer.parseInt(dadosSeparados[1]));
                        cliente.setCidade(dadosSeparados[2]);
                        Boolean isAlterado = iClienteDAO.alterar(cliente);
                        if (isAlterado) {
                            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao alterar o cliente", "Erro", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Telefone inválido", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Dados inválidos. Por favor, forneça Nome, Telefone e Cidade.", "Erro", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CPF inválido", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isAlterar(String opcao) {
        if ("4".equals(opcao)) {
            return true;
        }
        return false;
    }


    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isExcluir(String opcao) {
        return "3".equals(opcao);
    }


    private static void excluir(String dados) {
        try {
            Long cpfLong = Long.parseLong(dados);
            boolean isExcluir = iClienteDAO.excluir(cpfLong);
            if (isExcluir) {
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CPF inválido", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isOpcaoSair(String opcao) {

        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }


    private static void sair() {
        JOptionPane.showMessageDialog(null, " Obrigada", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {

        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }

}
