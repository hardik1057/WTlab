public class lab6_q8 {
    int a = 10;
    void display() {
        inner in = new inner();
        in.display();
    }
    public class inner {
        void display() {
            System.out.println(a);
        }
    }
    public static void main(String args[]) {
        lab6_q8 ob = new lab6_q8();
        ob.display();
    }
}