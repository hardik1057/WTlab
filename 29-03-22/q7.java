
class CheckArgument extends Exception {
    public String toString() {
        return "no. of arguments less than 4";
    }

}
public class q7 {
    public static void main(String[] args) {
        int s = 0;
        try {

            if (args.length < 4)
                throw new CheckArgument();
            else {
                System.out.println("length is greater than 4");
                for (String x : args)
                    s += (Integer.parseInt(x) * Integer.parseInt(x));
                System.out.println("sum:" + s);
            }
        } catch (CheckArgument e) {
            System.out.println(e);
        }
    }
}