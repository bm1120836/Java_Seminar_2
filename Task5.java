import java.util.Arrays;

public class Task5 {
    /**
     * @param args
     * @param sum
     */
    public static void main(String[] args) {
        String str;
        int sum = 0;
        int [] array = {55,34,44,89877,60,444,81,};                   
        for (int i = 0; i < array.length; i++) {
            str = Integer.toString(array[i]);                                         
            if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2)){      
                if (sum == 0) System.out.printf("  %d ",array[i]);            
                else System.out.printf(" + %d ",array[i]);                    
                sum += array[i];
            }
        }
        System.out.printf(" = %d",sum);  
    }
}