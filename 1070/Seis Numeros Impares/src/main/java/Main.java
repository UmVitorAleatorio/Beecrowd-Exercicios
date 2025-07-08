import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quantidade = Leitura();
        int[] sequenciaNumeros = Sequencia(quantidade);

        for (int sequencia : sequenciaNumeros) {
            System.out.println(sequencia);
        }
    }

    public static int Leitura() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int[] Sequencia(int quantidade) {
        List<Integer> sequencia = new ArrayList<>();

        for (int i = quantidade, j = 0; j < 6; i += 2, j++) {
            if (i % 2 == 0) {
                i++;
            }
            sequencia.add(i);
        }
        return sequencia.stream().mapToInt(Integer::intValue).toArray();
    }
}