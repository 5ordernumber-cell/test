
package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Please enter your name: ");
        
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "! Welcome to Java programming.");
        
        scanner.close();
    }
    
}
