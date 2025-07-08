import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = Leitura();
        int[] arrayPares = Pares(numeros);
        System.out.println(arrayPares.length + " valores pares");
    }

    public static int[] Leitura() {
        List<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            numeros.add(sc.nextInt());

        }
        return numeros.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] Pares(int[] numeros) {
        return Arrays.stream(numeros).filter(n -> n % 2 == 0).toArray();
    }
}
