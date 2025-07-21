import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] resultadoDerby = {0, 0, 0};

        do {
            simulaDerby(resultadoDerby);

            if (imprimePergunta() == 2) {
                imprimeResultados(resultadoDerby);
                break;
            }
        } while (true);
        sc.close();
    }

    private static int leitura() {
        return sc.nextInt();
    }

    private static void simulaDerby(int[] estatisticasDerby) {
        int golsCorinthians = leitura();
        int golsPalmeiras = leitura();

        if (golsCorinthians > golsPalmeiras) {
            estatisticasDerby[0] += 1; //Vitória do Corinthians
        } else if (golsCorinthians == golsPalmeiras) {
            estatisticasDerby[1] += 1; // Empate
        } else {
            estatisticasDerby[2] += 1; // Vitória do Palmeiras
        }
    }

    private static int imprimePergunta() {
        System.out.println("Novo derby (1-sim 2-nao)");
        return leitura();
    }

    private static void imprimeResultados(int[] resultadoDerby) {
        System.out.println(Arrays.stream(resultadoDerby).sum() + " Dérbis Paulistas");
        System.out.println("Corinthians:" + resultadoDerby[0]);
        System.out.println("Palmeiras:" + resultadoDerby[2]);
        System.out.println("Empates:" + resultadoDerby[1]);
        imprimeVencedor(resultadoDerby);
    }

    private static void imprimeVencedor(int[] resultadoDerby) {
        if (resultadoDerby[0] > resultadoDerby[2]) {
            System.out.println("Corinthians venceu mais");
        } else if (resultadoDerby[2] > resultadoDerby[0]) {
            System.out.println("Palmeiras venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }
}
