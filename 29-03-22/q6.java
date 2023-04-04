import java.util.Scanner;
class HrsException extends Exception {
    public HrsException(String s) {
        super(s);
    }
}
class MinsException extends Exception {
    public MinsException(String s) {
        super(s);
    }
}
class SecsException extends Exception {
    public SecsException(String s) {
        super(s);
    }
}
public class q6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.println("Enter number of Hours:");
            int h = obj.nextInt();
            if (h > 24 || h < 0) {
                throw new HrsException("Caught Hours Exception");
            }
            System.out.println("Enter number of Minutes:");
            int m = obj.nextInt();
            if (m > 60 || m < 0) {
                throw new MinsException("Caught Minutes Exception");
            }
            System.out.println("Enter number of Seconds:");
            int s = obj.nextInt();
            if (s > 60 || s < 0) {
                throw new SecsException("Caught Seconds Exception");
            }
        } catch (HrsException e) {
            System.out.println(e.getMessage());
        } catch (MinsException e) {
            System.out.println(e.getMessage());
        } catch (SecsException e) {
            System.out.println(e.getMessage());
        }
    }
}