public class AdvancedAstrology {
 
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
 
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size-i);
            printStars(i);
        }
    }
 
    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }
 
    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            int star = i *2 -1;
            printSpaces(height-i);
            printStars(star);
            star = star + 2;
        }
//        for (int i = 0; i < 2; i++) {
//            printSpaces(height - 2);
//            printStars(3);
//        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }
 
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(5);
        christmasTree(8);
    }
}