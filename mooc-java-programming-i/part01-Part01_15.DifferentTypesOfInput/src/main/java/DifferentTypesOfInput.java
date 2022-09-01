
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String text = scan.nextLine();
        
        System.out.println("Give an integer:");
        int whole = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double dub = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean boo = Boolean.valueOf(scan.nextLine());
       
       

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + whole);
        System.out.println("You gave the double " + dub);
        System.out.println("You gave the boolean " + boo);
        

    }
}
