import java.util.Scanner;

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

public class program {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner iScanner = new Scanner(System.in);
        System.out.println("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s!\n", name);
        iScanner.close();
    }
}

    // private static void main() {
    //     // проверить, что сумма a и b лежит между 10 и 20
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.println("name: ");
    //     String name = iScanner.nextLine();
    //     System.out.printf("Hello, %s!", name);
    //     iScanner.close();
    // }
    // private static void call(){
    // main();
    // }
    // call();
// }

// public class program{
    //     private static boolean sumBetween10And20(int a, int b) {
    //         // проверить, что сумма a и b лежит между 10 и 20
    //         int a = in.nextInt();
    //         return false;
    //     }
    // }

// private static boolean isPositive(int x) {
//     // проверить, что х положительное
//     return false;
// }

// private static void printString(String source, int repeat) {
//     // напечатать строку source repeat раз
// }

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