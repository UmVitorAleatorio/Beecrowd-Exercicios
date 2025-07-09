package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantNumeros;
        Scanner sc = new Scanner(System.in);

        do {
            quantNumeros = sc.nextInt();
            if (quantNumeros != 0) {
                int[] sequencia = new int[quantNumeros];

                for (int i = 0; i < quantNumeros; i++) {
                    sequencia[i] = sc.nextInt();
                }

                boolean aindaTem;
                int pontos = 0;
                do {
                    aindaTem = false;
                    for (int i = 0; i < sequencia.length - 1; i++) {
                        int aux;
                        if (sequencia[i] > sequencia[i + 1]) {
                            aux = sequencia[i];
                            sequencia[i] = sequencia[i + 1];
                            sequencia[i + 1] = aux;
                            aindaTem = true;
                            pontos++;
                        }
                    }
                } while (aindaTem);

                if (pontos % 2 != 0) {
                    System.out.println("Marcelo");
                } else {
                    System.out.println("Carlos");
                }
            }
        } while (quantNumeros != 0);
    }
}
