
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numberOne = Integer.valueOf(scan.nextLine());
        int numberTwo = Integer.valueOf(scan.nextLine());
        
        double sum = Math.sqrt(numberOne + numberTwo);
        
        System.out.println(sum);
        

    }
}
