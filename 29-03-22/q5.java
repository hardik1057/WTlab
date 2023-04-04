import java.util.Scanner;
class NegativeNumberException extends Exception {
    String msg;
    public NegativeNumberException(String s) {
        super(s);
    }
}
class A {
    void ProcessInput() {
        try {
            Scanner obj = new Scanner(System.in);
            int d = obj.nextInt();
            if (d < 0) {
                throw new NegativeNumberException("Caught negative number exception");
            }
            else{
                double d1=(double)d;
                System.out.println(d1);
            }
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
public class q5 {
    public static void main(String[] args) {
        A obj = new A();
        obj.ProcessInput();
    }
}
