import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999){
                break;
            }
            list.add(input);
        }
        
        int smallestNumber = list.get(0);
        for (int i = 1; i<list.size(); i++) {
            if (list.get(i)<smallestNumber) {
                smallestNumber = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallestNumber);
        
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i)==smallestNumber){
                System.out.println("Found at index: " + i);
            }
        }
            
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
