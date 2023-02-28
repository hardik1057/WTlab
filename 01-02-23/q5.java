/* WAP in java which will accept n number from CLA and display thier sum */
public class q5 {
    public static void main(String[] args) {
        int n = args.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(args[i]);
            sum += num;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
