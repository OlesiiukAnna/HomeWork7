package home.Task_07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
/*
Задана строка с датой вида "22.01.2019 19:15:00".
Написать метод который преобразовывает ее в формат "22 Jan, 7:15 PM".
Предусмотреть обработку ситуации если входящая дата в недопустимом формате.
 */
public class Task_07_3 {
    public static void main(String[] args) {
        String date = "22.01.2019 19:15:00";

        System.out.println(formatDate(date));
    }

    public static String formatDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        DateTimeFormatter formatterRequired = DateTimeFormatter.ofPattern("dd MMM, h:mm a");
        try {
            LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
            return dateTime.format(formatterRequired);
        } catch (DateTimeParseException exception) {
            throw new IllegalArgumentException("Not able to parse the date for given date");
        }
    }
}
