package Java.Test;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type something: ");
        
        String str = s.nextLine();
        
        System.out.println("Hello " + str);

        s.close();
    }
}