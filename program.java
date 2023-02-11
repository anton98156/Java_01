
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



public class program {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        // int val = 3;
        swap(array, val:3);
        System.out.println(Arrays.ToString(array)); // [2, 2, 3, 3]
    }

    private static void swap(int[] array, int val) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {

            int temp = 0;
            if (array[i] == val && array.length - count > i) {

                while (array[array.length-count]==val){
                    count++;
                }
                temp = array[array.length-count];
                array[array.length - count] = array[i];
                count++;
                array[i] = temp;
            }
        }
    }
}