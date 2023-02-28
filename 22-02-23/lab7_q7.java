import java.util.Scanner;

public class lab7_q7 {
    class Account {
        int acc_no, balance;

        void display() {
            System.out.println("Account Number:" + acc_no + "\nBalance:" + balance);
        }
    }

    class Person extends Account {
        String name;
        int adr_no;

        Person() {
            System.out.println("Enter the Account number:");
            Scanner obj = new Scanner(System.in);
            acc_no = obj.nextInt();
            System.out.println("Enter the Balance:");
            balance = obj.nextInt();
            System.out.println("Enter the name of the person:");
            name = obj.next();
            System.out.println("Enter the Adhar card number:");
            adr_no = obj.nextInt();
            obj.close();
        }

        void display() {
            System.out.println("Name:" + name + "\nAdhar Card number:" + adr_no + "\nAccount Number:" + acc_no
                    + "\nBalance:" + balance);
        }
    }

    public static void main(String[] args) {
        lab7_q7 obj = new lab7_q7();
        for (int i = 0; i < 5; i++) {
            Person arr = obj.new Person();
            arr.display();
        }
    }
}
