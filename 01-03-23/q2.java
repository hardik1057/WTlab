abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }
}

public class q2 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Triangle t = new Triangle(3, 4);
        Square s = new Square(6);
        System.out.println("Area of Circle: " + c.calculateArea());
        System.out.println("Area of Triangle: " + t.calculateArea());
        System.out.println("Area of Square: " + s.calculateArea());
    }
}
