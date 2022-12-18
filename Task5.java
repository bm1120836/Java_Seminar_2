import java.util.Arrays;
import java.util.Random;

/*
 * Дан массив целых чисел. 
 * Найти сумму элементов, у которых последняя и предпоследняя цифры равны.
 */
// 1. Задать массив.
// 2. Заполнить массив случайными числами.
// 3. Создать цикл с условием выделения чисел, у которых последняя и предпоследняя цифры равны.




public class Task5 {
    /**
     * @param args
     * @param sum
     */
    public static void main(String[] args, char[] sum) {
        int[] array = { 131, 266, 30, 4755, 5 };
        System.out.println(Arrays.toString(array));
        //int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                int num = array[i];
                int num1 = num % 100;
                int num2 = num1 % 10;
                int num3 = num1 - num2;
                int num4 = num3 / 10;
                if (num4 == num2) {
                    int summ = array[i];
                }
            }
            //int sum = sum + array[i];
        }
    System.out.println(summ);
    }
        
            
        }
    
    

