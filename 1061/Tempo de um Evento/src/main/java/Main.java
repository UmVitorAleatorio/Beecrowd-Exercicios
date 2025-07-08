import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer dia;
        String horario;
        String[] horarioArray;
        String[] eventoTempo = new String[2];
        int[] resultadoTempo = new int[6];
        LocalDateTime inicio = null, fim = null;


        for (int i = 0; i < 2; i++) {
            dia = extrairDia(sc.nextLine());
            horario = sc.nextLine();
            horarioArray = horario.split(" : ");
            horario = String.join(", ", horarioArray);
            eventoTempo[i] = "2025, 1, " + dia + ", " + horario;
            horario = String.join(",", eventoTempo[i]);
            horarioArray = horario.split(", ");
            for (int j = 0; j < 6; j++) {
                resultadoTempo[j] = Integer.parseInt(horarioArray[j]);
            }
            if (i == 0) {
                inicio = LocalDateTime.of(resultadoTempo[0], resultadoTempo[1], resultadoTempo[2], resultadoTempo[3], resultadoTempo[4], resultadoTempo[5]);
            }
            if (i == 1) {
                fim = LocalDateTime.of(resultadoTempo[0], resultadoTempo[1], resultadoTempo[2], resultadoTempo[3], resultadoTempo[4], resultadoTempo[5]);
            }
        }

        Duration entre = Duration.between(inicio, fim);
        System.out.println(entre.toDaysPart() + " dia(s)\n" +
                entre.toHoursPart() + " hora(s)\n" +
                entre.toMinutesPart() + " minuto(s)\n" +
                entre.toSecondsPart() + " segundo(s)");
    }

    public static Integer extrairDia(String leitura) {

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(leitura);
        if (matcher.find())
            return Integer.parseInt(matcher.group());
        return 0;
    }
}
