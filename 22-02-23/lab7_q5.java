import java.util.*;

public class lab7_q5 {
    class Shape {
        double area;

        void showArea() {
            System.out.println("Area: " + area);
        }
    }

    class Circle extends Shape {
        double r;

        void input() {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter the radius of the circle");
            r = obj.nextDouble();
            obj.close();
        }

        void calculate() {
            area = (3.14 * r * r);
        }

        void showArea() {
            System.out.println("Area of the Circle is " + area);
        }
    }

    class Rectangle extends Shape {
        int l, b;

        void input() {
            Scanner obj1 = new Scanner(System.in);
            System.out.println("Enter the length of the rectangle:");
            l = obj1.nextInt();
            System.out.println("Enter the breadth of the rectangle:");
            b = obj1.nextInt();
            obj1.close();
        }

        void calculate() {
            area = (l * b);
        }

        void showArea() {
            System.out.println("Area of the Rectangle is " + area);
        }
    }

    public static void main(String[] args){
        lab7_q5 ob=new lab7_q5();
        Circle obj=ob.new Circle();
        obj.input();
        obj.calculate();
        obj.showArea();
        Rectangle obj1=ob.new Rectangle();
        obj1.input();
        obj1.calculate();
        obj1.showArea();
    }
}
