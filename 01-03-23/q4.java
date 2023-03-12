import java.util.Scanner;
abstract class Student {
    int rollno, regno;
    abstract void course();
}
class kiitian extends Student {
    void course() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the roll number and register number of the Student:");
        rollno = obj.nextInt();
        regno = obj.nextInt();
        obj.close();
    }
    void display() {
        System.out.println("Roll no:" + rollno + "\nRegister no:" + regno);
    }
}
public class q4 {
    public static void main(String args[]){
        kiitian obj=new kiitian();
        obj.course();
        obj.display();
    }
}
