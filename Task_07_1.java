package home.Task_07;

import java.util.Arrays;
import java.util.Random;

/*
1. Создать 2 мерный массив (матрица) M*N и заполнить его случайными числами.
Отсортировать числа по возрастанию, чтобы с левом верхнем углу было самое маленькое число,
справа от него следующее по значению, итд, в правом нижнем углу самое большое.
 */
public class Task_07_1 {

    public static void main(String[] args) {

        int m = 4;
        int n = 10;
        int[][] array = new int[m][n];

        fill(array);
        print(array);
        sort(array);
        System.out.println("");
        print(array);
    }

    public static void sort(int[][] array) {
        int[] oneRowArray = new int[array.length * array[0].length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                oneRowArray[index++] = array[i][j];
            }
        }
        Arrays.sort(oneRowArray);

        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = oneRowArray[newIndex++];
            }
        }
    }

    public static void fill(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random random = new Random();
                array[i][j] = random.nextInt(200);
            }
        }
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
