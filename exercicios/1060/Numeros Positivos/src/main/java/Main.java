import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] entrada = new double[6];
        int numPositivos = 0;

        for (int i = 0; i <= 5; i++) {
            entrada[i] = sc.nextDouble();
        }

        for (int i = 0; i <= 5; i++) {
            if (entrada[i] > 0) {
                numPositivos++;
            }
        }

        System.out.println(numPositivos+" valores positivos");
    }
}