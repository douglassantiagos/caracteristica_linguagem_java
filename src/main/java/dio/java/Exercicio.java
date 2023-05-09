package dio.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class Exercicio {
    public static void main(String[] args) {

        Calendar dueDate = Calendar.getInstance();
        dueDate.add(Calendar.DATE, -4);
        System.out.println("Data de vencimento: " + dueDate.getTime());
        // Data de vencimento: Thu Mar 16 19:46:40 BRT 2023

        dueDate.add(Calendar.DATE, +10);
        System.out.println("Dia vencido: " + dueDate.getTime());

        Calendar currentDate = Calendar.getInstance();
        System.out.println("Data atual: " + currentDate.getTime());
        // Data atual: Mon Mar 20 19:46:40 BRT 2023

        if (currentDate == dueDate) {
            System.out.println("true");
        }
    }
}
