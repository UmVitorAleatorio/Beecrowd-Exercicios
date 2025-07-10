import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seq;
        do {
            int rodadas = 1;

            seq = sc.nextInt();
            if (seq != 0) {
                int[] vetorSeq = new int[seq];

                for (int i = 0; i < seq; i++) {
                    vetorSeq[i] = sc.nextInt();
                }

                int[] auxVet = new int[vetorSeq.length];
                System.arraycopy(vetorSeq, 0, auxVet, 0, vetorSeq.length);
                Arrays.sort(auxVet);
                do {
                    for (int i = 0; i < vetorSeq.length - 1; i++) {
                        int aux;
                        if (vetorSeq[i] > vetorSeq[i + 1]) {
                            aux = vetorSeq[i + 1];
                            vetorSeq[i + 1] = vetorSeq[i];
                            vetorSeq[i] = aux;
                            rodadas++;
                        }
                    }

                    if (!Arrays.equals(vetorSeq, auxVet)) {
                        for (int i = vetorSeq.length - 1; i > 0; i--) {
                            int aux;
                            if (vetorSeq[i] < vetorSeq[i - 1]) {
                                aux = vetorSeq[i];
                                vetorSeq[i] = vetorSeq[i - 1];
                                vetorSeq[i - 1] = aux;
                                rodadas++;
                            }
                        }
                    }
                } while (!Arrays.equals(vetorSeq, auxVet));


                if (rodadas % 2 == 0) {
                    System.out.println("Marcelo");
                } else {
                    System.out.println("Carlos");
                }

            }
        }while (seq != 0);
    }
}
