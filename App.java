package ProjetoJAVA;

import javax.swing.JOptionPane;

import ProjetoJAVA.Conta.ContaPF;
import ProjetoJAVA.Conta.ContaPJ;

public class App {
    public static void main(String[] args) {
        // criar vetores de contas
        ContaPF contasPf[] = new ContaPF[10];
        ContaPJ contasPj[] = new ContaPJ[10];

        // crias aplcação do banco
        boolean aberta = true;
        int contPF = 0;
        int contPJ = 0;
        int contaAtual = 0;
        while (aberta) {
            int acao = Integer.parseInt(JOptionPane
                    .showInputDialog("WELCOME TO NEW BANK" 
                            +"\n"
                            + "\nEscolha a ação desejada: "
                            +"\n"
                            + "\n 1 - Abrir Conta Pesooa Fisica: "
                            + "\n 2 - Abrir Conta Pessoa Juridica: "
                            + "\n 3 - Acessar Conta Pessoa Fisica: "
                            + "\n 4 - Acessar Conta Pessoa Juridica: "
                            + "\n 5 - Sair"));

            if (acao == 1) {// abrir conta PF
                // criar conta
                // instanciar objeto
                contasPf[contPF] = new ContaPF();// objeto criado
                // preencher as informaçoes da conta
                // preencher as informações da conta
                contasPf[contPF].setNome(JOptionPane.showInputDialog("NEW BANK - Conta PF" +"\n Informe o Nome:"));
                contasPf[contPF].setnCpf(JOptionPane.showInputDialog("NEW BANK - Conta PF" +"\n Informe o CPF:"));
                contasPf[contPF].setSaldo(0);
                contasPf[contPF].setnConta(1000 + contPF);
                JOptionPane.showMessageDialog(null,
                        "NEW BANK INFORMA: Sua Conta PF foi criada!" + "\n O número da conta é: " + contasPf[contPF].getnConta());
                contPF++;

            } else if (acao == 2) {// abrir conta PJ
                // criar conta
                // instanciar objeto
                contasPj[contPJ] = new ContaPJ();// objeto criado
                // preencher as informaçoes da conta
                contasPj[contPJ].setNome(JOptionPane.showInputDialog("NEW BANK - Conta PJ" +"\n Informe o Nome:"));
                contasPj[contPJ].setnCnpj(JOptionPane.showInputDialog("NEW BANK - Conta PJ" +"\n Informe o CNPJ:"));
                contasPj[contPJ].setSaldo(0);
                contasPj[contPJ].setnConta(2000 + contPJ);
                JOptionPane.showMessageDialog(null,
                        "NEW BANK Informa: Sua Conta PJ foi criada!" + "\n O número da conta é: " + contasPj[contPJ].getnConta());
                contPJ++;

            } else if (acao == 3) {// buscar a conta já criada da PF
                int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("NEW BANK - Buscan de Conta PF" +"\n Informe o nº da conta buscada:"));
                if (nContaBusca -1000 >=0 & nContaBusca - 1000 <= contPF-1) { //range de procura para impedir conta invalida
                    for (int i = 0; i < contasPf.length; i++) {
                    // busca pelo nº da conta
                    if (nContaBusca == contasPf[i].getnConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "NEW BANK - Conta PF Encontrada");
                        break;
                    } 
                }
                boolean acessar = true;
                while (acessar) {
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog("NEW BANK - Sua Conta PF" +"\n Ação Desejada:"
                            + "\n"
                            + "\n 1 - Verificar Saldo"
                            + "\n 2 - Saque"
                            + "\n 3 - Depósito"
                            + "\n 4 - Empréstimo"
                            + "\n 5 - Sair da Conta")); // voltar para menu principal
                    if (acao2 == 1) {
                        JOptionPane.showMessageDialog(null, "Saldo: R$ " + contasPf[contaAtual].getSaldo());
                    } else if (acao2 == 2) {
                        contasPf[contaAtual].saque();
                        JOptionPane.showMessageDialog(null, "Saldo: R$ " + contasPf[contaAtual].getSaldo());
                    } else if (acao2 == 3) {
                        contasPf[contaAtual].deposito();
                        JOptionPane.showMessageDialog(null, "Saldo: R$ " + contasPf[contaAtual].getSaldo());
                    } else if (acao2 == 4) {
                        contasPf[contaAtual].emprestimo();
                        JOptionPane.showMessageDialog(null, "Saldo: R$ " + contasPf[contaAtual].getSaldo());
                    } else if (acao2 == 5) {
                        acessar = false;
                    }else {
                     JOptionPane.showMessageDialog(null, "NEW BANK - Opção Inválida");
                }
                }
                } else {
                     JOptionPane.showMessageDialog(null, "NEW BANK - Número de Conta Inválido");
                }
                
            } else if (acao == 4) {// buscar a conta já criada da PJ
                int nContaBuscapj = Integer.parseInt(JOptionPane.showInputDialog("NEW BANK - Busca de Conta PJ" +"\nInforme o nº da conta buscada:"));
                    if (nContaBuscapj -2000 >=0 & nContaBuscapj - 2000 <= contPJ-1){
                for (int j = 0; j < contasPj.length; j++) {
                    // busca pelo nº da conta
                    if (nContaBuscapj == contasPj[j].getnConta()) {
                        contaAtual = j;
                        JOptionPane.showMessageDialog(null, "NEW BANK - Conta PJ Encontrada");
                        break;
                    }
                }
                boolean acessar = true;
                while (acessar) {
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog("NEW BANK - Sua Conta PJ" +"\n Ação Desejada:"
                            + "\n"
                            + "\n 1 - Verificar Saldo"
                            + "\n 2 - Saque"
                            + "\n 3 - Depósito"
                            + "\n 4 - Empréstimo"
                            + "\n 5 - Sair da Conta")); // voltar para o menu principal
                    if (acao2 == 1) {
                        JOptionPane.showMessageDialog(null, "Saldo: R$ " + contasPj[contaAtual].getSaldo());
                    } else if (acao2 == 2) {
                        contasPj[contaAtual].saque();
                        JOptionPane.showMessageDialog(null, "Saldo: R$ " + contasPj[contaAtual].getSaldo());
                    } else if (acao2 == 3) {
                        contasPj[contaAtual].deposito();
                        JOptionPane.showMessageDialog(null, "Saldo: R$ " + contasPj[contaAtual].getSaldo());
                    } else if (acao2 == 4) {
                        contasPj[contaAtual].emprestimo();
                        JOptionPane.showMessageDialog(null, "Saldo: R$ " + contasPj[contaAtual].getSaldo());
                    } else if (acao2 == 5) {
                        acessar = false;
                    }else {
                     JOptionPane.showMessageDialog(null, "NEW BANK - Opção Inválida");
                }
                }
            }else {
                     JOptionPane.showMessageDialog(null, "NEW BANK - Número de Conta Inválido");
                }
            } else if (acao == 5) {// fechar programa
                aberta = false;
            }else {
                     JOptionPane.showMessageDialog(null, "NEW BANK - Opção Inválida");
                }

        }
    }
}