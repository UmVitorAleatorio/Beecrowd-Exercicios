package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hrInicio, minInicio, hrFim, minFim;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores de inicio e fim");
        hrInicio = sc.nextInt();
        minInicio = sc.nextInt() * 59;
        hrFim = sc.nextInt();
        minFim = sc.nextInt() * 59;

        int saidaHr, saidaMin;

        if (hrInicio < hrFim) {
            saidaHr = hrFim - hrInicio + 24;
        } else if (hrInicio == hrFim) {
            saidaHr = 24;
        } else {
            saidaHr = hrInicio - hrFim + 23;
        }

        if (minInicio > minFim ) {
            saidaMin = minInicio - minFim;
            saidaHr -= 1;
        } else {
            saidaMin = (minFim / 59) - (minInicio / 59);
        }

        while (saidaMin > 59){
            saidaMin -= 60;
            saidaHr++;
        }

        while (saidaHr > 24){
            saidaHr -= 24;
        }

        System.out.println("O JOGO DUROU "+saidaHr+" HORA(S) E "+saidaMin+" MINUTO(S)");
    }
}