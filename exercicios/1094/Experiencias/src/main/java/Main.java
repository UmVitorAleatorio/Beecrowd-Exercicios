import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int quantidade = sc.nextInt();
        int[] cobaias = cobaias(quantidade);
        imprime(cobaias);
        sc.close();
    }

    private static int[] cobaias(int quantidade) {
        int[] cobaias = new int[3];
        int auxInt;
        String auxString;

        for (int i = 0; i < quantidade; i++) {
            auxInt = sc.nextInt();
            auxString = sc.nextLine();

            if (auxString.contains("C")) {
                cobaias[0] += auxInt;
            } else if (auxString.contains("R")) {
                cobaias[1] += auxInt;
            } else if (auxString.contains("S")) {
                cobaias[2] += auxInt;
            }
        }
        return cobaias;
    }

    private static void imprime(int[] cobaias) {
        DecimalFormat df = new DecimalFormat("00.00");
        double aux = Arrays.stream(cobaias).sum();

        System.out.println("Total: " + (int)aux + " cobaias");
        System.out.println("Total de coelhos: " + cobaias[0]);
        System.out.println("Total de ratos: " + cobaias[1]);
        System.out.println("Total de sapos: " + cobaias[2]);
        System.out.println("Percentual de coelhos: " + df.format((cobaias[0] / aux) * 100) + " %");
        System.out.println("Percentual de ratos: " + df.format((cobaias[1] / aux) * 100) + " %");
        System.out.println("Percentual de sapos: " + df.format((cobaias[2] / aux) * 100) + " %");
    }
}