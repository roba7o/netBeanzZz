
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number? ");
        int userInput1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number? ");
        int userInput2 = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        for (int i = userInput1; i <= userInput2; i++) {
            sum = sum + i;
        }
        
        System.out.println("The sum is " + sum);

    }
}
