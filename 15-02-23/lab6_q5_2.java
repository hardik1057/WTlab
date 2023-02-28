public class lab6_q5_2 {
    static {
        System.out.println("In static block displaying before main block");
    }
    public static void main(String[] args) {
        System.out.println("In main block displaying after static block");
    }
}