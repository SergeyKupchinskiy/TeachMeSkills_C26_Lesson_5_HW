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
                if ((i+j)%2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
        }
        //create a loop for each row of a two-dimensional array,
        // in which each row becomes a one-dimensional array and is displayed on the screen
        for (int i = 0; i < array.length; i++) {
            String[] array2 = array[i];
            System.out.print(Arrays.toString(array2));
            System.out.println();
        }
    }
}
