import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {
        int casos = leitor();
        for (int i = 0; i < casos; i++) {
            double[] notas = iterador();
            imprimeMedia(notas);
        }
        sc.close();
    }

    private static int leitor() {
        return sc.nextInt();
    }

    private static double[] iterador() {
        List<Double> lista = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
            lista.add(sc.nextDouble());
        }
        return lista.stream().mapToDouble(Double::doubleValue).toArray();
    }

    private static void imprimeMedia(double[] notas) {
        double media = ((notas[0] * 2) + (notas[1] * 3) + (notas[2] * 5)) / 10;
        System.out.println(df.format(media));
    }
}