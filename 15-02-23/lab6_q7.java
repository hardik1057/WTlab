public class lab6_q7 {
    public static double area(double radius) {
        return 3.14 * radius * radius;
    }
    public static double area(float base, float height) {
        return 0.5 * base * height;
    }

    public static double area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        double circleArea = area(5.0);
        double triangleArea = area(3.5f, 4.5f);
        double rectangleArea = area(5, 10);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Triangle Area: " + triangleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}
