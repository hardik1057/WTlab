/*WAP in java which will acccept two integer and display thier sum using SCanner class*/
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the two integers is: " + sum);
        sc.close();
    }
}
