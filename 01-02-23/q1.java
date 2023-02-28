/* WAP in java which willl accept your name and display the same using SCanner class*/
import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter Name- ");
        String name = myobj.nextLine();
        System.out.println("Name is " + name);
        myobj.close();
    }
}