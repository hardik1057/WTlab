class cons {
    cons(int a) {
        System.out.println(a);
    }
}

class lab7_q8 extends cons {
    lab7_q8(int a) {
        super(a);
        System.out.println("derived class constructor");

    }

    public static void main(String[] args) {
        //lab7_q8 obj = new lab7_q8(10);

    }
}
