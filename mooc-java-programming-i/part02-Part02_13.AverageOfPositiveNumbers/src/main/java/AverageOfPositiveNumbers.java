
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
                        
            } else if (number > 0) {
                sum = sum  + number;
                count = count +1;
                
            } 
            
        }
        
        if (count > 0) {
            double average = (double)sum/count;
            System.out.println("Average of the numbers: " + average);           
        } else {
            System.out.println("Cannot calculate the average");
        }
        
        
        
        

    }
}
