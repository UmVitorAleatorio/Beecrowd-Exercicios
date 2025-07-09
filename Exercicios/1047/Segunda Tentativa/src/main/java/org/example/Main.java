package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hrInicio, minInicio, hrFim, minFim;
        Scanner sc = new Scanner(System.in);

        hrInicio = sc.nextInt() * 60;
        minInicio = sc.nextInt();
        hrFim = sc.nextInt() * 60;
        minFim = sc.nextInt();

        int hrSaida = 0, minSaida = 60;

        if (hrInicio != hrFim && minInicio != minFim) {
            hrSaida = (hrFim - hrInicio) / 60;
        } else if (hrInicio == 0 && hrFim == 0) {
            hrSaida = 0;
        } else if (minInicio == 0 && minFim == 0) {
            minSaida = 0;
        } else {
            hrSaida = 24;
            minSaida = 0;
        }

        if (minInicio < minFim){
            minSaida = minFim - minInicio;
        }else if (minInicio > minFim) {
            minSaida -= minInicio - minFim;
            hrSaida--;
        }

        if(hrSaida < 0){
            hrSaida += 24;
        }

        if(minSaida > 59){
            hrSaida++;
        }

        System.out.println("O JOGO DUROU "+hrSaida+" HORA(S) E "+minSaida+" MINUTO(S)");
    }
}