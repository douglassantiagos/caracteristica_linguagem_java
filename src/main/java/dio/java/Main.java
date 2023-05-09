package dio.java;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é: " + agora.getTime());
        // A data corrente é: Mon Mar 20 19:19:12 BRT 2023

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        // 15 dias atrás: Sun Mar 05 19:20:31 BRT 2023

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        // 4 meses depois: Wed Jul 05 19:22:45 BRT 2023

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        // 2 anos depois: Sat Jul 05 19:22:45 BRT 2025

        Calendar convertData = Calendar.getInstance();

        System.out.printf("%tc\n", convertData);
        // seg mar 20 19:27:30 BRT 2023

        System.out.printf("%tF\n", convertData);
        // 2023-03-20

        System.out.printf("%tD\n", convertData);
        // 03/20/23

        System.out.printf("%tr\n", convertData);
        // 07:28:39 PM

        System.out.printf("%tT\n", convertData);
        // 19:28:39
    }
}