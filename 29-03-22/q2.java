class SuperClassException extends Exception {
    SuperClassException() {
        super("Super Class Exception");
    }
}

class SubClassException extends SuperClassException {
    public SubClassException() {
        super();
        System.out.println(this.getMessage());
        System.out.println("Sub class Exception");
    }
}

public class q2 {
    public static void main(String[] args) {
        try {
            throw new SubClassException();
        } catch (SubClassException e) {
        }
    }
}
