
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number? ");
        int userInput = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        
        for (int i = 0; i <= userInput; i++) {
            sum = sum + i;
        }
        
        System.out.println(sum);
        
        
        
    }
       

    
}
