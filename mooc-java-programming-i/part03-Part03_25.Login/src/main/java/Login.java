
import java.util.Scanner;
import java.util.ArrayList;


public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username");
        String username = scanner.nextLine();
        
        System.out.println("Enter password");
        String password = scanner.nextLine();
        
        ArrayList<String> usernameDirectory = new ArrayList<>();
        ArrayList<String> passwordDirectory = new ArrayList<>();
        
        usernameDirectory.add("alex");
        usernameDirectory.add("emma");
        
        passwordDirectory.add("sunshine");
        passwordDirectory.add("haskell");
        
//        System.out.println(usernameDirectory.get(0));
//        System.out.println(passwordDirectory.get(0));
//        System.out.println(usernameDirectory.get(1));
//        System.out.println(passwordDirectory.get(1));

        
        int i;
        for (i=0; i<usernameDirectory.size(); i++) {
            if (username.equals(usernameDirectory.get(i)) && password.equals(passwordDirectory.get(i))) {
                System.out.println("You have successfully logged in!");
                break;
            } 
            if (i==usernameDirectory.size()) {
                System.out.println("Incorrect username or password!");
            }
        }
        
    }
}
