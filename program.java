import java.util.Calendar;

// public class program {
    //     public static void main(String[] args) {
    
    //         print(new int[]{1, 1, 0, 1, 1, 1}); // 3
    //         print(new int[]{1, 1, 1, 1, 1, 1}); // 6
    //         print(new int[]{1, 1, 1, 1, 0, 0}); // 4
    //         }
    
    // /**
    //  * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    //  */
    //         private static void print(int[] array) {
    //         int counter = 0;
    //         int maxCounter = 0;
    //         for (int i = 0; i < array.length; i++) {
    //             if (array[i] == 1) {
    //                 counter++;
    //             }
    //             else {
    //                 if (maxCounter < counter) {
    //                     maxCounter = counter;
    //                 }
    //                 counter = 0;
    //             }
    //         }
    //         if (maxCounter < counter) {
    //             maxCounter = counter;
    //         }
    //         System.out.println(maxCounter);
    
    //         }
    // }

/**
 * Дан массив nums = [3,2,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */


// import java.util.Arrays;

// public class program {
//     public static void main(String[] args) {
//         System.out.print("\033[H\033[2J");
//         int[] array = {3, 2, 2, 3};
//         // swap(array, 3);
//         System.out.println(Arrays.toString(array)); // [2, 2, 3, 3]
//     }

    // private static void swap(int[] array, int val) {
    //     int count = 1;
    //     for (int i = 0; i < array.length; i++) {

    //         int temp = 0;
    //         if (array[i] == val && array.length - count > i) {

    //             while (array[array.length-count]==val){
    //                 count++;
    //             }
    //             temp = array[array.length-count];
    //             array[array.length - count] = array[i];
    //             count++;
    //             array[i] = temp;
    //         }
    //     }
    // }
// }

// HOME WORK:
// Seminar 1

// Написать метод, принимающий на вход два целых числа и проверяющий,
//  * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         System.out.print("\033[H\033[2J");
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("int a: ");
//         int a = iScanner.nextInt();
//         System.out.println("int b: ");
//         int b = iScanner.nextInt();
//         iScanner.close();   
//         System.out.println(sumBetween10And20 (a, b));
//     }
//     private static boolean sumBetween10And20(int a, int b) {
//         if (10 <= a+b && a+b <= 20) {
//             return true;
//         }
//         else {
//             return false;
//         }
//     }
// }

//Написать метод, проверяющий что х положитеьное
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         System.out.print("\033[H\033[2J");
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("int x: ");
//         int x = iScanner.nextInt();
//         iScanner.close();   
//         System.out.println(isPositive(x));
//     }
//     private static boolean isPositive(int x){
//         if (x >= 0) {
//             return true;
//         }
//         else {
//             return false;
//         }
//     }
// }

// Написать метод, печатающий строку source repeat раз
// import java.util.Scanner;
// public class program{
//     public static void main(String[] args){
//         System.out.print("\033[H\033[2J");
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("repat: ");
//         int x = iScanner.nextInt();
//         iScanner.close();
//         int count = 0;
//         while (count != x){
//             printString();
//             count++;
//         }
//     }
//     public static void printString(){
//         System.out.println("source");
//     }
// }

// Написать метод, проверяющий, является ли год высокосным

public class program{
    public static void main(String[] args){
        main_data(null);
    }
    
    public static void main_data(int[][] array){
        int[][] data_array = {
            {2000,	2020,	2040,	2060,	2080},
            {2004,	2024,	2044,	2064,	2084},
            {2008,	2028,	2048,	2068,	2088},
            {2012,	2032,	2052,	2072,	2092},
            {2016,	2036,	2056,	2076,	2096} 
        };
        System.out.println("Высокосные года XXI века: ");
        for (int i = 0; i < data_array.length; i++){
            for (int j = 0; j < data_array.length; j++){
                System.out.print(data_array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

// private static boolean isLeapYear(int year) {
//     // проверить, является ли год високосным. если да - return true
//     return false;
// }

// private static int[] createArray(int len, int initalValue) {
//     // должен вернуть массив длины len, каждое значение которого равно initialValue
//     return null;
// }

// private static String findCommonPrefix(String[] source) {
//     /** Найти общий префикс среди слов из одного массива.
//      * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
//      */
//     return null;
// }

// /**
//  * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//  * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//  * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//  * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
//  * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//  * 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
//  */
// }