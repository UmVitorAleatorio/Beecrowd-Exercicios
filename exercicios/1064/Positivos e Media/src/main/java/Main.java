import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {
        double[] numeros;
        double media;

        numeros = Leitura();
        System.out.println(numeros.length + " valores positivos");
        media = Media(numeros);
        System.out.println(df.format(media));

    }

    public static double[] Leitura() {
        List<Double> numeros = new ArrayList<Double>();

        for (int i = 0; i < 6; i++) {
            numeros.add(sc.nextDouble());
            numeros.removeIf(n -> n <= 0);
        }
        return numeros.stream()
                .mapToDouble(Double::doubleValue)
                .toArray();
    }

    public static double Media(double[] numeros) {
        return Arrays.stream(numeros).average().orElse(0.0);
    }
}