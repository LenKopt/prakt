package com.company.lesson7.algoritms;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        //int[] array = {0, 2, 5, 3, 4};
        int[] array = {50, 20, 15, 3, 4};

        /*for (int[] arr : array) {
            System.out.print(Arrays.toString(arr) + " => ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }*/
        System.out.println("Reverse order");
        sort(array);
    }

    public static void sort(int[] array) {
        // i - номер прохода
        for (int i = 0; i <= array.length - 1; i++) {
            // внутренний цикл прохода
            boolean isBreak = true;

            for (int j = 0; j < array.length - i - 1; j++) {
                boolean isChange = false;

                if (array[j + 1] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isChange = true;
                    isBreak = false;
                }
                System.out.println(i + "" + j + " " + Arrays.toString(array) + (isChange ? " +" : " -"));
            }
            if (isBreak) {
                break;
            }
        }
    }
}
