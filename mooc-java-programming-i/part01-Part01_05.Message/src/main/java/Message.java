
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here\
        
        // Reading the string written by the user
        //inputs are always a 'string'
        String message = scanner.nextLine();
        
        // Now to print out the message (literally message variable)
        
        System.out.println(message);
                
        

    }
}
