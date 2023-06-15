package ProjetoJAVA.Conta;

import javax.swing.JOptionPane;

public abstract class Conta {
    //atributos
    String nome;
    int nConta;
    double saldo;
    //set get
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //método vazio
    public void saque() {
        int saque = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Saque: "));
        if(saldo - saque >= saldo ){
        saldo = saldo - saque;}
        else JOptionPane.showMessageDialog(null,"Se não tem, não saca");
        }
     public void deposito() {
            int deposito = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Depósito: "));
            saldo = saldo + deposito;
            
     }
     public void emprestimo() {
        int emprestimo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Empréstimo: "));
        if (emprestimo <= saldo*3){
            saldo = saldo + emprestimo;
        }
        else JOptionPane.showMessageDialog(null,"Empréstimo negado");
     }
}

