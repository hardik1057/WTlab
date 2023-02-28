import java.util.Scanner;

public class lab7_q1 {
    public class rectangle {
        private int length, breadth;
        public void input() {
            System.out.print("Enter the length- ");
            Scanner ob = new Scanner(System.in);
            length = ob.nextInt();
            System.out.print("Enter the breadth- ");
            Scanner ob1 = new Scanner(System.in);
            breadth = ob1.nextInt();
            ob.close();
            ob1.close();
        }
        void area() {
            System.out.println("Area- " + (length * breadth));
        }
        void perimeter() {
            System.out.println("Perimeter- " + 2* (length+breadth));
        }
    }
    public static void main(String[] args) {
        lab7_q1 obj = new lab7_q1();
        rectangle obj1 = obj.new rectangle();
        obj1.input();
        obj1.area();
        obj1.perimeter();
    }
}