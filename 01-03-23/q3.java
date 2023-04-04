abstract class Shape {
    abstract public double calculateArea();
}
class Circle extends Shape {
    double r;

    Circle(double radius) {
        r = radius;
    }
    public double calculateArea() {
        double area = ((22 / 7) * r * r);
        return area;
    }
}
class Triangle extends Shape {
    double b, h;

    Triangle(double base, double height) {
        b = base;
        h = height;
    }

    public double calculateArea() {
        double area = (0.5 * b * h);
        return area;
    }
}
class Square extends Shape {
    double l;

    Square(double length) {
        l = length;
    }
    public double calculateArea() {
        double area = (l * l);
        return area;
    }
}
public class q3 {
    public static void main(String[] args) {
        Shape obj;
        obj = new Circle(5);
        System.out.println("Area of the Circle is " + obj.calculateArea());
        obj = new Triangle(3, 4);
        System.out.println("Area of the Triangle is " + obj.calculateArea());
        obj = new Square(6);
        System.out.println("Area of the Square is " + obj.calculateArea());
    }
}