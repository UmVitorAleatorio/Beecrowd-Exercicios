package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = (Math.pow(b, 2) - 4 * a * c);
        if (delta >= 0 && a > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("R1 = "+df.format(x1));
            System.out.println("R2 = "+df.format(x2));
        }else {
            System.out.println("Impossivel calcular");
        }

    }
}