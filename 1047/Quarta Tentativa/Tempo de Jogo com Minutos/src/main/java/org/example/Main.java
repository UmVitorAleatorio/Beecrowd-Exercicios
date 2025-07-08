package org.example;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Horario inicio = LerHorario();
        Horario fim = LerHorario();

        int difTotal;

        if(inicio.totalMin() < fim.totalMin()) {
            difTotal = fim.totalMin() - inicio.totalMin();
        }else {
            difTotal = (1440 + fim.totalMin()) - inicio.totalMin();
        }

        int horaFinal = difTotal / 60;
        int minutoFinal = difTotal % 60;

        System.out.println("O JOGO DUROU "+horaFinal+" HORA(S) E "+minutoFinal+" MINUTO(S)");
    }

    public static Horario LerHorario (){
        int hora = sc.nextInt();
        int minuto = sc.nextInt();
        return new Horario(hora, minuto);
    }

    record Horario(int hora, int minuto) {
        public int totalMin(){
            return hora * 60 + minuto;
        }
    }
}