import java.util.Scanner;

/*
 * Дана последовательность целых чисел, оканчивающаяся нулем. 
 * Найти сумму положительных чисел, после которых следует отрицательное число.
 */


public class Task2 {
    public static void main(String[] args) {
        int a; // текущее число
        int b; // последующее число
        int sum = 0; // сумма положительных чисел
        int n; // число элементов в последовательности
         Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         a = scanner.nextInt();
         
         for(int i = 1; i < n; i++ ) {
             b = scanner.nextInt();
             if((a > 0) && (b < 0)) {
                 sum+=a;
             }
             a=b;
             
         }
         System.out.println("sum = " + sum);
         scanner.close();
         
     }
     
     }

