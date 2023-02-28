/* WAP in java which will 10 numbers from KB and display the  count of even , odd, sum of even , odd, and grand total using Scanner class*/
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0, oddCount = 0, evenSum = 0, oddSum = 0, total = 0;
        for (int i = 1; i <= 10; i++) 
        {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            if (num % 2 == 0) 
            {
                evenCount++;
                evenSum += num;
            } 
            else 
            {
                oddCount++;
                oddSum += num;
            }
            total += num;
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Grand total: " + total);
        sc.close();
    }
}
