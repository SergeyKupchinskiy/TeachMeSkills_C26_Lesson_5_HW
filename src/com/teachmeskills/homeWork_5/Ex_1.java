package com.teachmeskills.homeWork_5;
/*Шахматная доска
	Создать программу для раскраски шахматной доски с помощью цикла.
	Создать двумерный массив String'ов 8х8. С помощью циклов задать
	элементам циклам значения B(Black) или W(White). Результат работы
	программы:
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
	W B W B W B W B
	B W B W B W B W
 */
import java.util.Arrays;

public class Ex_1 {
    public static void main(String[] args) {
        //we define a two-dimensional array of dimensions 8 by 8
        String[][] array = new String[8][8];

        //create a loop that checks the parity of the index of array elements
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 != 0 && j % 2 == 0) {
                    array[i][j] = "B";
                } else if (i % 2 != 0) {
                    array[i][j] = "W";
                }
                if (i % 2 == 0 && j % 2 == 0) {
                    array[i][j] = "W";
                } else if (i % 2 == 0) {
                    array[i][j] = "B";
                }
            }
        }
        //display each row of the array
        System.out.println(Arrays.deepToString(array[0]));
        System.out.println(Arrays.deepToString(array[1]));
        System.out.println(Arrays.deepToString(array[2]));
        System.out.println(Arrays.deepToString(array[3]));
        System.out.println(Arrays.deepToString(array[4]));
        System.out.println(Arrays.deepToString(array[5]));
        System.out.println(Arrays.deepToString(array[6]));
        System.out.println(Arrays.deepToString(array[7]));

    }
}
