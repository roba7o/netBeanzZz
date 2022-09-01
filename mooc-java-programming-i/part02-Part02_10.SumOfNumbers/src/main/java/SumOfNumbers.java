
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        
        
        Scanner fart = new Scanner(System.in);
        
       
        int blank = 0;
        int count = 0;
                
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(fart.nextLine());
            
            if (number == 0) {
                break;
            }
                    
            blank = blank + number;
            
        }
        System.out.println("Sum of the numbers: " + blank);
    }
}