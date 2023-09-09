package com.dio.model;

// Crie o projeto ContaBanco que receberá dados via terminal
// contendo as características de conta em banco conforme atributos abaixo:

// Exemplo:
//        Atributo |  Tipo  |  Exemplo
//        -----------------------------
//        Numero  |   Inteiro |   1021
//        Agencia  |   Texto	 |  067-8
//        Nome Cliente | Texto | MARIO ANDRADE
//        Saldo   |   Decimal	 |  237.48

public class ContaBanco{
    private int numero = 0;
    private String agencia = "";
    private String nomeCliente = "";
    private double saldo = 0.00;

    public ContaBanco(int numeroConta, String agencia, String nomeCliente, double saldo) {
        this.numero = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente.toUpperCase();
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {

        double saldo = Double.parseDouble(String.valueOf(getSaldo()));
        String result = String.format("%.2f", saldo);

        return "--------------------------------------------------------------------" +
                "\n Olá "+ nomeCliente.toUpperCase()+", obrigado por criar uma conta em nosso banco!" +
                "\n" +
                "\n| Sua agencia é: " + agencia+
                "\n| Conta:  " + numero+
                "\n| e seu Saldo: "+ result +" e já está disponível para saque." +
                "\n--------------------------------------------------------------------";
    }

}
