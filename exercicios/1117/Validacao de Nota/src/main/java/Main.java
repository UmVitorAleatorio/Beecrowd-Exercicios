import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        double nota1 = leitura();
        while (!isEntreZeroEDez(nota1)) {
            nota1 = leitura();
        }
        double nota2 = leitura();
        while (!isEntreZeroEDez(nota2)) {
            nota2 = leitura();
        }
        imprimeNota(nota1, nota2);
        sc.close();
    }

    private static double leitura() {
        return sc.nextDouble();
    }

    private static boolean isEntreZeroEDez(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("nota invalida");
            return false;
        }
        return true;
    }

    private static void imprimeNota(double nota1, double nota2) {
        System.out.println("media = " + df.format((nota1 + nota2) / 2));
    }
}