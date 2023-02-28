public class lab6_q5_1 {
    static int count = 0;
    static void show_count() {
        System.out.println("Value of static variable:" + count);
    }
    static void increment_count() {
        count += 10;
    }
    public static void main(String[] args) {
        lab6_q5_1.show_count();
        lab6_q5_1.increment_count();
        System.out.println("After increment ");
        lab6_q5_1.show_count();
    }
}
