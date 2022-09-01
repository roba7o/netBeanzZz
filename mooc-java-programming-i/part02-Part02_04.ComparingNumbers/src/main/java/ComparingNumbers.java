
import java.util.Scanner;

public class ComparingNumbers {
    
    public static void main(String[] args){ 
        Scanner scan = new Scanner (System.in);
        
        int numberOne = Integer.valueOf(scan.nextLine());
        int numberTwo = Integer.valueOf(scan.nextLine());
        
        if (numberOne == numberTwo) {
            System.out.println(numberOne + " is equal to " + numberTwo);
            
        } else if (numberOne > numberTwo) {
            System.out.println(numberOne + " is greater than " + numberTwo);
            
        } else {
            System.out.println(numberTwo + " is smaller than " + numberOne);
        }
    
    
    
    
      
    }  
    
    
}
