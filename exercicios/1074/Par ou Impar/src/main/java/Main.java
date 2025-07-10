import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantidade = leitura();
        int[] seqNumeros = sequencia(quantidade);
        verificador(seqNumeros);
    }

    static Scanner sc = new Scanner(System.in);

    private static int leitura() {
        return sc.nextInt();
    }

    private static int[] sequencia(int quantidade) {
        List<Integer> sequencia = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            sequencia.add(sc.nextInt());
        }
        return sequencia.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void verificador(int[] seqNumeros) {
        for (int i = 0; i < seqNumeros.length; i++) {
            if (seqNumeros[i] % 2 == 0 && seqNumeros[i] != 0) {
                pares(seqNumeros, i);
            } else if (seqNumeros[i] % 2 != 0) {
                impares(seqNumeros, i);
            } else {
                System.out.println("NULL");
            }
        }
    }

    private static void pares(int[] seqNumeros, int i) {
        if (seqNumeros[i] > 0) {
            System.out.println("EVEN POSITIVE");
        } else {
            System.out.println("EVEN NEGATIVE");
        }
    }

    private static void impares(int[] seqNumeros, int i) {
        if (seqNumeros[i] > 0) {
            System.out.println("ODD POSITIVE");
        } else {
            System.out.println("ODD NEGATIVE");
        }
    }
}