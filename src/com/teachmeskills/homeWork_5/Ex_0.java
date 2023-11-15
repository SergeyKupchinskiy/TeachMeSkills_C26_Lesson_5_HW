package com.teachmeskills.homeWork_5;
/*Создать трехмерный массив из целых чисел.
	С помощью циклов "пройти" по всему массиву и увеличить каждый
	элемент на заданное число. Пусть число, на которое будет
	увеличиваться каждый элемент, задается из консоли.
	*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex_0 {
    public static void main(String[] args) {
        //create a three-dimensional array
       int[][][] array = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 11, 12}, {22, 23, 24}, {25, 26, 7}}, {{31, 32, 33}, {34, 6, 2}, {8, 9, 7}}};
        System.out.println("Original array: ");
        System.out.println(Arrays.deepToString(array));
        System.out.println("enter the number by which you want to increase each element of the array: ");

        //create a scanner to enter the number by which we want to increase each element of the array
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        //create a loop to increase each element of the array
        for (int i=0; i< array.length; i++){
            for (int j=0; j< array[i].length; j++){
                for (int k=0; k< array[i][j].length; k++){
                    array[i][j][k] += a;
                    System.out.println(array[i][j][k]);

                }
            }
        }
    }
}
