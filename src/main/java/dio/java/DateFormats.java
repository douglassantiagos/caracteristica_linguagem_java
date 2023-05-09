package dio.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

public class DateFormats {
    public static void main(String[] args) {
        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        // 20/03/2023 20:06

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // 20 de mar�o de 2023 20:09

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        // 20 de mar�o de 2023 20:10:06 BRT


        /* ---- SimpleDateFormat --- */
        Date agoraData = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mm");

        String dataFormatada = formatter.format(agoraData);

        System.out.println(dataFormatada);
        // 20/03/2023 20:17:48:17
    }
}
