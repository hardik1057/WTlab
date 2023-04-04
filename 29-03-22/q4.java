public class q4 {
    public static void main(String[] args) {
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }
    }
}