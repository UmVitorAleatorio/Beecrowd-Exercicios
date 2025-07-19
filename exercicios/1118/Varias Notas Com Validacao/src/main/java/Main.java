import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        boolean isContinuar = true;
        do {
            double nota1 = leitura();
            while (isNotaInvalida(nota1)) {
                nota1 = leitura();
            }
            double nota2 = leitura();
            while (isNotaInvalida(nota2)) {
                nota2 = leitura();
            }
            imprimeMedia(nota1, nota2);
            double aux = imprimeEscolha();
            while (aux < 1 || aux > 2) {
                aux = imprimeEscolha();
            }
            switch ((int)aux) {
                case 1:
                    continue;
                case 2:
                    isContinuar = false;
                    break;
            }
        } while (isContinuar);
        sc.close();
    }

    private static double leitura() {
        return sc.nextDouble();
    }

    private static boolean isNotaInvalida(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("nota invalida");
            return true;
        }
        return false;
    }

    private static void imprimeMedia(double nota1, double nota2) {
        System.out.println("media = " + df.format((nota1 + nota2) / 2));
    }

    private static double imprimeEscolha(){
        System.out.println("novo calculo (1-sim 2-nao)");
        return leitura();
    }
}