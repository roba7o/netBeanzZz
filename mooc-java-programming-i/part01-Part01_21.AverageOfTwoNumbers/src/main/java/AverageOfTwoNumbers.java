
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int valueOne = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int valueTwo = Integer.valueOf(scanner.nextLine());
        
        double average = ((double) valueOne + valueTwo)/2;
        
        System.out.println("The average is " + average);

    }
}
