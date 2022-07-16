
import java.util.*;

public class Main {
    // print hello world
    public static void main(String[] args) {
        System.out.println("Hello World");
        // ask for name
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}