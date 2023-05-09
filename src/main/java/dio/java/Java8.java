package dio.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java8 {
    public static void main(String[] args) {
        // LocalDate
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);

        // LocalTime
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);

        LocalTime maisUmaHora = horaAtual.plusHours(1);
        System.out.println(maisUmaHora);

        // LocalDateTime
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);
        System.out.println(futuro);

        // EXERCÍCIO -> Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00
        LocalDateTime timeSelected = LocalDateTime.of(2010, 05, 15, 10, 00, 00);
        System.out.println(timeSelected);

        LocalDateTime futuroTimeSelected = timeSelected.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(futuroTimeSelected);


    }
}
