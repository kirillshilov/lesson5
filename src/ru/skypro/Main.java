package ru.skypro;

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
            System.out.print(num [0] + ",");
            System.out.print(num [1] + ",");
            System.out.println(num [2]);
            System.out.print(numTwo [0] + ",");
            System.out.print(numTwo [1] + ",");
            System.out.println(numTwo [2]);
            System.out.print(numThree [0] + ",");
            System.out.print(numThree [1] + ",");
            System.out.println(numThree [2]);
        }
        {
            // Задача 3
            int[] num = new int[]{1, 2, 3};
            float[] numTwo = new float[]{1.57f, 7.654f, 9.986f};
            int[] numThree = {1, 15, 48};
            System.out.print(num [2] + ",");
            System.out.print(num [1] + ",");
            System.out.println(num [0]);
            System.out.print(numTwo [2] + ",");
            System.out.print(numTwo [1] + ",");
            System.out.println(numTwo [0]);
            System.out.print(numThree [2] + ",");
            System.out.print(numThree [1] + ",");
            System.out.println(numThree [0]);
        }
        {
            // Задача 4
            int[] num = new int[]{1, 2, 3};
            for (int i = 0; i < 3; i++) {
                int number = num [i];
                if ( number % 2 != 0){
                    num [i] = number + 1;
                }
            }
        }
    }
}