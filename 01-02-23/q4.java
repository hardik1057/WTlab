/* WAP in java which will accept two integer value from commnad Line argumet and display their sum */
public class q4 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum = num1 + num2;
        System.out.println("The sum of the two integers is: " + sum);
    }
}
