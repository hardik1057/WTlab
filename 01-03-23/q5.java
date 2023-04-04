//import java.util.Scanner;

abstract class Bank {
    double ROI;
    abstract public void find_ROI();
}

class HDFC extends Bank {
    public void find_ROI() {
        System.out.println("Enter the Rate of Interest for HDFC Bank:");
        //Scanner obj = new Scanner(System.in);
        //super.ROI = obj.nextDouble();
    }

    public void display() {
        System.out.println("Rate of interest of HDFC Bank is " + ROI);
    }
}

class ICICI extends Bank {
    public void find_ROI() {
        System.out.println("Enter the Rate of Interest for ICICI Bank:");
        //Scanner obj = new Scanner(System.in);
        //super.ROI = obj.nextDouble();
    }

    public void display() {
        System.out.println("Rate of interest of ICICI Bank is " + ROI);
    }
}

class BOI extends Bank {
    public void find_ROI() {
        System.out.println("Enter the Rate of Interest for Bank Of India:");
        //Scanner obj = new Scanner(System.in);
        //super.ROI = obj.nextDouble();
    }

    public void display() {
        System.out.println("Rate of interest of Bank Of India is " + ROI);
    }
}

public class q5 {
    public static void main(String[] args) {
        HDFC bank1 = new HDFC();
        ICICI bank2 = new ICICI();
        BOI bank3 = new BOI();
        bank1.find_ROI();
        bank1.display();
        bank2.find_ROI();
        bank2.display();
        bank3.find_ROI();
        bank3.display();
    }
}
