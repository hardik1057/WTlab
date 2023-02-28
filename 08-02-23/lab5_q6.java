class Customer {
    String custName;
    String custCellNo;
    String custPackage;
    int custAge;

    public void displayDetails() {
        System.out.println(custName);
        System.out.println(custCellNo);
        System.out.println(custPackage);
        System.out.println(custAge);
    }
}

public class lab5_q6 {
    Customer c[];

    public lab5_q6() {
        c = new Customer[3];

        for (int ctr = 0; ctr != 3; ctr++) {
            c[ctr] = new Customer();
        }
        c[0].custName = "Tom";
        c[0].custCellNo = "9801014568";
        c[0].custPackage = "Standard";
        c[0].custAge = 2;
        c[1].custName = "Carol";
        c[1].custCellNo = "9851034342";
        c[1].custPackage = "Standard";
        c[1].custAge = 2;
        c[2].custName = "Leonard";
        c[2].custCellNo = "9643036348";
        c[2].custPackage = "Executive";
        c[2].custAge = 25;
    }

    public void displayCollection() {
        for (int ctr = 0; ctr != 3; ctr++) {
            c[ctr].displayDetails();
        }
    }

    public static void main(String arg1s[]) {
        lab5_q6 obj = new lab5_q6();
        obj.displayCollection();
    }
}
