package ProjetoJAVA;

import javax.swing.JOptionPane;

import ProjetoJAVA.Conta.ContaPF;
import ProjetoJAVA.Conta.ContaPJ;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // criar os vetores de objetos
        ContaPF contasPf[] = new ContaPF[10];
        ContaPJ contasPj[] = new ContaPJ[10];
        // criar a aplicação do banco
        boolean aberta = true;
        int contPF = 0;
        int contPJ = 0;
        int contaAtual = 0;
        while (aberta) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha a ação desejada:"
                            + "\n 1-Abrir Conta PF (CPF)"
                            + "\n 2-Abrir Conta PJ (CNPJ)"
                            + "\n 3-Acessar Conta PF"
                            + "\n 4-Acessar Conta PJ"
                            + "\n 5-Sair"));
                            

            if (acao == 1) {// abrir conta PF
                // criar a conta
                // instanciar o objeto
                contasPf[contPF] = new ContaPF();// objeto criado
                // preencher as informações da conta
                contasPf[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPf[contPF].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                contasPf[contPF].setSaldo(0);
                contasPf[contPF].setnConta(0001 + contPF);
                contPF++;
                JOptionPane.showMessageDialog(null,
                        "Conta Criada, o número da sua conta é: " + contasPf[contaAtual].getnConta());
                        

            } else if (acao == 2) {// abrir conta PJ
                // criar a conta
                // instanciar o objeto
                contasPj[contPJ] = new ContaPJ();// objeto criado
                // preencher as informações da conta
                contasPj[contPJ].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPj[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ:"));
                contasPj[contPJ].setSaldo(0);
                contasPj[contPJ].setnConta(2000 + contPJ);
                contPJ++;
                JOptionPane.showMessageDialog(null,
                        "Conta Criada, o número da sua conta é: " + contasPj[contaAtual].getnConta());
                        

            } else if (acao == 3) {// buscar a conta já criada da PF
                int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                for (int i = 0; i < contasPf.length; i++) {
                    // busca pelo nº da conta
                    if (nContaBusca == contasPf[i].getnConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                        
                    }
                    

                    boolean acessarPf = true;
                    while (acessarPf) {
                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Escolha a ação desejada"
                                        + "\n 1-verificar saldo"
                                        + "\n 2-Saque"
                                        + "\n 3-Deposito"
                                        + "\n 4-Emprestimo"
                                        + "\n 5-Sair da Conta"));
                        if (acao2 == 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Seu saldo é R$: " + contasPf[contaAtual].getSaldo());
                        } else if (acao2 == 2) {
                            contasPf[contaAtual].saque();
                        } else if (acao2 == 3) {
                            contasPf[contaAtual].deposito();
                        } else if (acao2 == 4) {
                            contasPf[contaAtual].emprestimo();
                        } else if (acao2 == 5) {
                            acessarPf = false;
                        }
                    }
                }
            }

            else if (acao == 4) {// buscar a conta já criada da PJ
                int nContaBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                for (int i = 0; i < contasPj.length; i++) {
                    // busca pelo nº da conta
                    if (nContaBusca == contasPj[i].getnConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada" + contasPj[i].getnConta());
                        boolean acessarPj = true;
                        while (acessarPj) {
                            int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Escolha a ação desejada"
                                            + "\n 1-verificar saldo"
                                            + "\n 2-Saque"
                                            + "\n 3-Deposito"
                                            + "\n 4-Emprestimo"
                                            + "\n 5-Sair da Conta"));
                            if (acao2 == 1) {
                                JOptionPane.showMessageDialog(null,
                                        "Seu saldo é R$: " + contasPj[contaAtual].getSaldo());
                            } else if (acao2 == 2) {
                                contasPj[contaAtual].saque();
                            } else if (acao2 == 3) {
                                contasPj[contaAtual].deposito();
                            } else if (acao2 == 4) {
                                contasPj[contaAtual].emprestimo();

                            } else if (acao2 == 5) {
                                acessarPj = false;
                            }

                        }
                    }
                }

            } else if (acao == 5) {
                aberta = false;
            }
        }

    }
}