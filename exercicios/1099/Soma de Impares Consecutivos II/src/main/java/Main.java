import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int quantidade = leitor();
        injetaSoma(quantidade);
    }

    private static int leitor() {
        return sc.nextInt();
    }

    private static void injetaSoma(int quantidade) {
        int[] numeros = new int[2];
        int aux;

        for (int i = 0; i < quantidade; i++) {
            for (int j = 0; j < 2; j++) {
                numeros[j] = leitor();
            }
            if (numeros[0] > numeros[1]) {
                aux = numeros[0];
                numeros[0] = numeros[1];
                numeros[1] = aux;
            }
            aux = 0;
            if (numeros[0] == numeros[1]) {
                System.out.println(aux);
            } else {
                for (int j = numeros[0]; j < numeros[1]; j++) {
                    if (j % 2 != 0 && j != numeros[0]) {
                        aux += j;
                    }
                }
                System.out.println(aux);
            }
        }
    }
}

