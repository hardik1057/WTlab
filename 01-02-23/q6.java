/*WAP in java which will accept two integer and display htheir sum using INsputStyreamREader and BufferedReader*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first integer: ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.print("Enter second integer: ");
        int num2 = Integer.parseInt(br.readLine());
        int sum = num1 + num2;
        System.out.println("The sum of the two integers is: " + sum);
    }
}
