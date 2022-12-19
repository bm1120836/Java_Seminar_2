import java.util.Scanner;
import static java.lang.System.*;

/*
 * Дана последовательность из N целых чисел. 
 * Верно ли, что последовательность является возрастающей.
 */


public class Task4 {
    
    public static void main(String[] args) {
        int temp = 0, n = 0, min = 0;
        Boolean whichOf = true;
        Scanner scanner = new Scanner(in);
        System.out.println("Введите длину последовательности ");
        n = scanner.nextInt();
        System.out.print("Введите элемент последовательности номер 1: ");
        min = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            System.out.printf("Введите элемент последовательности номер %s: ", i);
            temp = scanner.nextInt();
            if (min < temp) min = temp;
            else whichOf = false;                        
        }
        scanner.close();
        if (whichOf) System.out.println("Последовательность возрастающая ");
        else System.out.println("Последовательность не является возрастающей ");
    }
}
