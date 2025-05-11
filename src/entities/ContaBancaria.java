package entities;

public class ContaBancaria {
    public String titular;
    public double saldo;

    public void depositar(double valorDeposito){
        if (valorDeposito <= 0){
            System.out.println("Valor de depósito inválido! * Tente novamente *");
        } else {
            saldo += valorDeposito;
            System.out.println("Depósito feito com sucesso!");
            System.out.println("Saldo Atualizado!");
        }
    }
    public void sacar(double valorSaque){
        if (valorSaque <= 0) {
            System.out.println("Valor de saque inválido! * Tente novamente *");
        } else if (valorSaque <= saldo){
            saldo -= valorSaque;
            System.out.println("Saque feito com sucesso!");
            System.out.println("Saldo Atualizado!");
        }else {
            System.out.println("Saldo insuficiente para saque! * Tente novamente");
        }
    }
    public void exibirSaldo(){
        System.out.println("TITULAR: " + titular);
        System.out.println("SALDO: " + String.format("R$%.2f",saldo));
    }
}
