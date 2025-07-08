import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = Leitura();
        int[] arrayPares = Pares(numeros);
        int[] arrayImpares = Impares(numeros);
        int[] arrayPositivos = numerosPositivos(numeros);
        int[] arrayNegativos = numerosNegativos(numeros);
        String aux = " valor(es) ";

        System.out.println(arrayPares.length+aux+"par(es)");
        System.out.println(arrayImpares.length+aux+"impar(es)");
        System.out.println(arrayPositivos.length+aux+"positivo(s)");
        System.out.println(arrayNegativos.length+aux+"negativo(s)");
    }

    public static int[] Leitura() {
        int[] numeros = IntStream.range(0, 5)
                .map(i -> sc.nextInt())
                .toArray();
        return numeros;
    }

    public static int[] Pares(int[] numeros) {
        return Arrays.stream(numeros).filter(n -> n % 2 == 0).toArray();
    }

    public static int[] Impares(int[] numeros) {
        return Arrays.stream(numeros).filter(n -> n % 2 != 0).toArray();
    }

    public static int[] numerosPositivos(int[] numeros) {
        return Arrays.stream(numeros).filter(n -> n > 0).toArray();
    }

    public static int[] numerosNegativos(int[] numeros) {
        return Arrays.stream(numeros).filter(n -> n < 0).toArray();
    }
}