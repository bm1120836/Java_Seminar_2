import java.util.ArrayList;

/*
 * Дан массив целых чисел. 
 * Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */


public class Task6 {

    public static void main(String[] args) {
        ArrayList <Integer> array = new ArrayList<>();
        int [] ar = {2673, 451267, -35678 ,600, 123, -12, -9807, -98, 456};    
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > 0 && (ar[i] > 9 && ar[i] < 100)) sum += i;  
        }
        for (int i : ar) {
            if (i > 0) {
                array.add(i);
            }
            else array.add(sum);
        }
        System.out.println(array);
    }


    
}
