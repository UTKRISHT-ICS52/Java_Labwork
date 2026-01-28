// Program number : 4(Largest of two numbers input by user)
import java.util.Scanner;
public class Forth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Largest number is: " + a);
        } else {
            System.out.println("Largest number is: " + b);
        }
    }
}