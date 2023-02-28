import java.util.Scanner;
class Circle{
        double radius;
        public
            void input(double r){
                radius=r;
            }
            void findArea(){
                double area = 3.14 * radius * radius;
                System.out.println("Area of the circle is "+area);
            }
            void findPerimeter(){
                double peri= 2 * 3.14 * radius;
                System.out.println("Perimeter of the circle is "+peri);
            }
}
public class lab5_q1 {
    public static void main(String[] args){
        Circle obj=new Circle();
        Scanner s=new Scanner(System.in);
        double rad=s.nextInt();
        obj.input(rad);
        obj.findArea();
        obj.findPerimeter();
        s.close();
    }
}
