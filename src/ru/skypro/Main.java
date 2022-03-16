package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        {
            //Задача 1
            int[] num = new int[]{1, 2, 3};
            float[] numTwo = new float[]{1.57f, 7.654f, 9.986f};
            int[] numThree = {1, 15, 48};
        }
        {
            //Задача 2
            int[] num = new int[]{1, 2, 3};
            float[] numTwo = new float[]{1.57f, 7.654f, 9.986f};
            int[] numThree = {1, 15, 48};
            for (int i = 0; i < num.length; i++) {
                if (i == num.length - 1){
                    System.out.println(num [i]);
                    break;
                }
                System.out.print(num [i] + ", ");
            }
            for (int i = 0; i < numTwo.length; i++) {
                if (i == num.length - 1){
                    System.out.println(numTwo [i]);
                    break;
                }
                System.out.print(numTwo [i] + ", ");
            }
            for (int i = 0; i < numThree.length; i++) {
                if (i == num.length - 1){
                    System.out.println(numThree [i]);
                    break;
                }
                System.out.print(numThree [i] + ", ");
            }
        }
        {
            // Задача 3
            int[] num = new int[]{1, 2, 3};
            float[] numTwo = new float[]{1.57f, 7.654f, 9.986f};
            int[] numThree = {1, 15, 48};
            for (int i = numTwo.length - 1; i >= 0; ) {
                if (i == 0){
                    System.out.println(num [i]);
                    break;
                }
                System.out.print(num [i] + ",");
                i = i-1;
            }
            for (int i = numTwo.length - 1; i >= 0; ) {
                if (i == 0){
                    System.out.println(numTwo [i]);
                    break;
                }
                System.out.print(numTwo [i] + ",");
                i = i-1;
            }
            for (int i = numThree.length - 1; i >= 0; ) {
                if (i == 0){
                    System.out.println(numThree [i]);
                    break;
                }
                System.out.print(numThree [i] + ",");
                i = i-1;
            }
        }
        {
            // Задача 4
            int[] num = new int[]{1, 2, 3};
            for (int i = 0; i < num.length; i++) {
                int number = num [i];
                if ( number % 2 != 0){
                    num [i] = number + 1;
                }
            }
        }
    }
}