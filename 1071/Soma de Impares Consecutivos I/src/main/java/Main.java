import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inicio, fim;

        inicio = leitura();
        fim = leitura();
        int[] sequencia = imparesConsecutivos(inicio, fim);
        System.out.println(soma(sequencia));
    }

    static Scanner sc = new Scanner(System.in);

    public static int leitura() {
        return sc.nextInt();
    }

    public static int[] imparesConsecutivos(int inicio, int fim) {
        List<Integer> impares = new ArrayList<Integer>();

        if (inicio > fim) {
            int aux = fim;
            fim = inicio;
            inicio = aux;
        }

        for (int i = inicio + 1; i < fim; i++) {
            if (i % 2 != 0) {
                impares.add(i);
            }
        }
        return impares.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int soma(int[] sequencia) {
        return Arrays.stream(sequencia).sum();
    }
}
