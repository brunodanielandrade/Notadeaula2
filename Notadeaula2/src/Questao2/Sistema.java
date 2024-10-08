package Questao2;

import java.util.Scanner;
public class Sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Informe o tempo de espera (em minutos): ");
        int tempoEspera = scanner.nextInt();

        System.out.print("Informe a tarifa base: R$ ");
        double tarifaBase = scanner.nextDouble();

        System.out.print("Informe o fator de demanda: ");
        double fatorDemanda = scanner.nextDouble();

        // Cria uma nova corrida de Uber
        CorridaUber corrida = new CorridaUber(distancia, tempoEspera, tarifaBase, fatorDemanda);

        // Exibe os detalhes e o valor final da corrida
        corrida.exibirDetalhesCorrida();

        scanner.close();
    }
}