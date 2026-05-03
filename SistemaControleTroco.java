package LISTAREVISAOJAVA;

import java.util.Locale;
import java.util.Scanner;

public class SistemaControleTroco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Padaria do Sr. Paiva: Sistema de Troco ---");

        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = entrada.nextLine();

        System.out.println("Informe o valor da compra total: R$ ");
        double valorCompra = entrada.nextDouble();

        System.out.print("Informe o valor pago pelo cliente: R$ ");
        double valorPago = entrada.nextDouble();

        System.out.println("\n--------------------------");

        System.out.println("Cliente: " + nomeCliente);
        System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
        System.out.printf("Valor pago: R$ %.2f%n", valorPago);

        if (valorPago < valorCompra) {
            System.out.println("ERRO: Valor insuficiente para realizar suas comprar!");

        } else {
            double trocoTotal = valorPago - valorCompra;
            System.out.printf("Troco Total: R$ %.2f%n", trocoTotal);

            if (trocoTotal > 0) {
                System.out.println("Distribuição das notas: ");
                calcularNotas(trocoTotal);

            } else {
                System.out.println("Não há troco a ser devolvido.");

            }
        
        }

        System.out.println("--------------------------");

        entrada.close();

    }

    public static void calcularNotas(double troco) {
        int valorRestante = (int) Math.round(troco);
        int[] cedulas = {200, 100, 50, 20, 10, 5, 2, 1 };

        for (int nota : cedulas) {

            if (valorRestante >= nota) {
                int quantidadeNotas = valorRestante / nota;
                valorRestante = valorRestante % nota;

                System.out.println(quantidadeNotas + "x R$" + nota);

            }
        }
    }
    
}
