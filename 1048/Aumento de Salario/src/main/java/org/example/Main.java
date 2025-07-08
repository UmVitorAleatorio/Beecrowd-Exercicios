package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double salario, reajuste;

        salario = sc.nextDouble();

        if (salario <= 400) {
            reajuste = salario * 0.15;
            salario = salario + reajuste;

            System.out.println("Novo salario: " + df.format(salario) + "\n" + "Reajuste ganho: " + df.format(reajuste) + "\n" + "Em percentual: 15 %");
        } else if (salario > 400 && salario <= 800) {
            reajuste = salario * 0.12;
            salario = salario + reajuste;

            System.out.println("Novo salario: " + df.format(salario) + "\n" + "Reajuste ganho: " + df.format(reajuste) + "\n" + "Em percentual: 12 %");
        } else if (salario > 800 && salario <= 1200) {
            reajuste = salario * 0.10;
            salario = salario + reajuste;

            System.out.println("Novo salario: " + df.format(salario) + "\n" + "Reajuste ganho: " + df.format(reajuste) + "\n" + "Em percentual: 10 %");
        } else if (salario > 1200 && salario <= 2000) {
            reajuste = salario * 0.07;
            salario = salario + reajuste;

            System.out.println("Novo salario: " + df.format(salario) + "\n" + "Reajuste ganho: " + df.format(reajuste) + "\n" + "Em percentual: 7 %");
        } else {
            reajuste = salario * 0.04;
            salario = salario + reajuste;

            System.out.println("Novo salario: " + df.format(salario) + "\n" + "Reajuste ganho: " + df.format(reajuste) + "\n" + "Em percentual: 4 %");
        }
    }
}