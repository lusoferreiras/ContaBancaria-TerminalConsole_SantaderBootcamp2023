package com.dio;

import com.dio.model.ContaBanco;
import java.util.*;


public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar Scanner a class Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem da conta criada
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "";
        double saldo = 0.00;

        Scanner read = new Scanner(System.in);
        ContaBanco contaBanco = new ContaBanco(numero + 1, agencia, nomeCliente, saldo);

//        Permita que os dados sejam inseridos via terminal
//        sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
//        Programa: "Por favor, digite o número da Agência !"
//        Usuário: 1021 (depois ENTER para o próximo campo)

        System.out.println("Olá, seja bem vindo a Agência 067-8 do Banco Santander!\n");
        String resposta = "";

        // Caso o usuário o insira o número da agência que foi predefinido ele terá que informar novamente.
        do {
            System.out.println("Por favor, digite o número da Agência: ");
            resposta = read.nextLine();
            System.out.println("\n\nVocê está na agência 067-8 do Banco Santander");
            // enquanto o dado digitado pelo usuário não for igual ao número da agência o programar não prosseguirá
        } while (!Objects.equals(resposta, agencia));

        contaBanco.setAgencia(resposta);
        // nessa parte os dados foram comparados e setados como pedido na etapa anterior

        //o usuário informa seu nome para quer seja iniciado o seguimento de sua conta
        System.out.println("\nInforme seu nome:");
        nomeCliente = read.nextLine();
        contaBanco.setNomeCliente(nomeCliente);

        // com o nome setado, o número da conta do usuário vai ser cadastrado de acordado com o sistema (+1) como foi instanciado
        contaBanco.setNumero(contaBanco.getNumero());

        // para dar seguimento a conta, o usuário vai precisar realizar um depósito em qualquer valor
        System.out.println(contaBanco.getNomeCliente() + ", faça seu primeiro depósito para que possamos continuar.");
        System.out.println("\n-----------------" + "\nInforme o valor:");
        double deposito = read.nextDouble();
        contaBanco.setSaldo(deposito);

        // Depois de todas as informações terem sido inseridas
        // o sistema deverá exibir a seguinte mensagem:
        // "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco,
        // sua agência é [Agencia], conta [Numero]
        // e seu saldo [Saldo] já está disponível para saque".
        System.out.println(contaBanco.toString());
        read.close();
    }
}