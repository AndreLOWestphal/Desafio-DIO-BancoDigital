package com;

public class Main {
    public static void main(String[] args) {
        Cliente andre = new Cliente();
        andre.setNome("André");

        Conta cCorrente = new ContaCorrente(andre);
        Conta poupanca = new ContaPoupanca(andre);
        poupanca.depositar(250);
        poupanca.imprimirExtrato();

        cCorrente.imprimirExtrato();
        poupanca.sacar(50);
        poupanca.imprimirExtrato();

        poupanca.transferir(105, cCorrente);
        cCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
