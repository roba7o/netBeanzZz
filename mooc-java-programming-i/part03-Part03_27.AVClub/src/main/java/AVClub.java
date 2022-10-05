
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String weirdAV = scanner.nextLine();
            if (weirdAV.equals("")){
                break;
            }
            
            String[] weirdAVSplit = weirdAV.split(" ");
            for (String word : weirdAVSplit) {
                if (word.contains("av")){
                    System.out.println(word);
                }
            }
            
        }


    }
}
