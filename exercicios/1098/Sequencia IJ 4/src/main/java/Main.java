import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double aux = 1;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0", symbols);
        for (double i = 0; i <= 2; i += 0.2) {
            for (double j = aux; j <= aux + 2; j++) {
                String auxI  = df.format(i);
                if (auxI.contains("0.0")) {
                    auxI = "0";
                } else if (auxI.contains("1.0")) {
                    auxI = "1";
                }else if (auxI.contains("2.0")) {
                    auxI = "2";
                }

                String auxJ  = df.format(j);
                if (auxJ.contains(".0")) {
                    auxJ = String.format("%.0f", j);
                }
                System.out.println("I=" + auxI + " J=" + auxJ);
            }
            aux += 0.2;
        }
    }
}
