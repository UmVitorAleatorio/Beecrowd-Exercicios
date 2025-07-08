import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantidade = Leitura();
        int[] arrayImpares = Impares(quantidade);
        for (int impares: arrayImpares) {
            System.out.println(impares);
        }
    }

    public static int Leitura() {
        Scanner sc = new Scanner(System.in);
        int quant = sc.nextInt();
        sc.close();
        return quant;
    }

    public static int[] Impares(int quant) {
        List<Integer> impares = new ArrayList<>();

        for (int i = 1; i <= quant; i += 2) {
            impares.add(i);
        }
        return impares.stream().mapToInt(i -> i).toArray();
    }
}