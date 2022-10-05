
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.equals("")){
                break;
            }
            String[] splitSentence = sentence.split(" ");
            for (String word : splitSentence) {
                System.out.println(word);
            }  
        }
    }   
}
