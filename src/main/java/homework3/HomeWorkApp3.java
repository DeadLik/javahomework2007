package homework3;

import sun.rmi.transport.proxy.RMISocketInfo;

public class HomeWorkApp3 {
    public static void main(String[] args) {

        int[] arrays = {1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1};
        replacement(arrays);
        System.out.println();

        int[] arr = new int[100];
        filling(arr);
        System.out.println();

        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyTwo(arr1);
        System.out.println();

        int[][] arr2 = new int[5][5];
        twoDimensionalArray(arr2);
        System.out.println();

        int[] arr3 = returnArray(50, 8);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println();

        int[] arr4 = {39, 25, 17, 87, 32, 44};
        minMaxArray(arr4);
        System.out.println();
        
        int[] arron = {2, 2, 2, 1, 2, 2, 10, 1};
        returnTrueFalse(arron);
        System.out.println(returnTrueFalse(arron));

        System.out.println();



    }

   // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void replacement(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == 0) {
                arrays[i] = 1;
            } else {
                arrays[i] = 0;
            }
            System.out.print(arrays[i] + " ");
        }
    }

    // Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void filling(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }

    }

    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void multiplyTwo(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 6) {
                arr1[i] *= 2;
            }
            System.out.print(arr1[i] + " ");
        }
    }

    // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void twoDimensionalArray(int[][] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (i == j || i + j == arr2.length -1) {
                    arr2[i][j] = 1;
                }
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
    // каждая ячейка которого равна initialValue;

    public static int[] returnArray(int len, int initialValue) {
        int[] res = new int[len];
        for (int i = 0; i < res.length; i++) {
            res[i] = initialValue;
        }
        return res;
    }

    // * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    public static void minMaxArray(int[] arrMxM) {

        int max = arrMxM[0];
        int min = arrMxM[0];


        for (int i = 0; i < arrMxM.length; i++) {
            if (arrMxM[i] > max) {
                max = arrMxM[i];
            }
            if (arrMxM[i] < min) {
                min = arrMxM[i];
            }
        }
        System.out.println("\nmax: " + max + "\nmin: " + min);
    }
    
    // ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, 
    //если в массиве есть место, в котором сумма левой и правой части массива равны.
    //Примеры:
    //checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    //checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    //граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

    public static boolean returnTrueFalse(int[] arron) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arron.length; i++) {
            leftSum += arron[i];
            for (int j = 0; j < arron.length; j++) {
                if (j > i) {
                    rightSum += arron[j];
                } else {
                    rightSum = 0;
                }
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
}
