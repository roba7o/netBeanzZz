
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void newLine(){
        System.out.print("\n");
    }

    public static void printStars(int number) {
        while (number >0 ){
            System.out.print("*");
            number = number - 1;
        }
        newLine();
    }
    
    public static void printSquare(int size) {
        int line = size;
        while (line >0 ) {
            printStars(size);
            line = line -1; 
        }
        //newLine();
       
    }

    public static void printRectangle(int width, int height) {
        while (height > 0) {
            printStars(width);
            height = height - 1;
            //newLine();
                    
        }
    }

//    public static void printTriangle(int size) {
//        int size0 = size;
//        while (size>-1){
//            printStars(size0-size);
//            size = size -1;
//            //newLine();
//        }
//    }
    
    public static void printTriangle(int size) {
        for(int i = 0; i<=size; i++){
            printStars(i);
        }
            
    }
}
