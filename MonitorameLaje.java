package LISTAREVISAOJAVA;

import java.util.Scanner;

public class MonitorameLaje {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double cargaProjeto = 15.0;
        double limiteSeguranca = cargaProjeto * 0.8;

        System.out.println("--- Sistema SafeBuild: Monitoramento de Carga ---");
        System.out.println("Digite a leitura atual do sensor (kN/m²): ");
        double cargaAtual = entrada.nextDouble();

        if (cargaAtual < limiteSeguranca) {
            System.out.println("Status: VERDE");
            System.out.println("Decisão: Operação normal. Carga dentro dos parâmetros de segurança.");

        } else if (cargaAtual >= limiteSeguranca && cargaAtual <= cargaProjeto) {
            System.out.println("Status: AMARELO (ALERTA)");
            System.out.println("Decisão: Reduzir velocidade de concretagem e evacuar pessoal não essencial.");
        } else {

            System.out.println("Status: VERMELHO (CRÍTICO)");
            System.out.println("Decisão: INTERROMPER IMEDIATAMENTE! Risco de colapso das escoras.");

            if (cargaAtual > (cargaProjeto * 1.2)) {
                System.out.println("ALERTA ADICIONAL: Possível falha catastrófica iminente. Evacuar área total.");
            }
        }

        entrada.close();

    }
    
}
