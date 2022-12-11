import java.util.Scanner;

/*
 * Дана последовательность N целых чисел. 
 * Найти количество положительных чисел, после которых следует отрицательное число.
 */


public class Task1 {
    
public static void main(String[] args) {
   int a; // текущее число
   int b; // последующее число
   int q = 0; // количество положительных чисел
   int n; // число элементов в последовательности
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    a = scanner.nextInt();
    
    for(int i = 1; i < n; i++ ) {
        b = scanner.nextInt();
        if((a < 0) && (b > 0)) {
            q = q + 1;
        }
        System.out.println("q = " + q);
    }
    scanner.close();
    
}

}