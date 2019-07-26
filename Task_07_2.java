package home.Task_07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
Задан текстовый файл. Вывести сколько в нём: a) строк b) слов c) символов
 */
public class Task_07_2 {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/java/home/Task_07/task2.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String line;
        List<String> strings = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            strings.add(line);
        }
        System.out.println("Number of strings: " + strings.size());

        System.out.println("Number of words: " + numberOfWords(strings));

        System.out.println("Number of symbols: " + numberOfSymbols(strings));

        reader.close();
    }

    public static int numberOfWords(List<String> list) {
        int result = 0;

        for (String line : list) {
            String[] words = line.split("\\s+");
            if (line.isEmpty()) {
                result = result;
            } else {
                result += words.length;
            }
        }
        return result;
    }

    public static int numberOfSymbols(List<String> list) {
        int result = 0;

        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).toCharArray().length;
        }
        return result;
    }

}
