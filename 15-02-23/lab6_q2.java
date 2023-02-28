public class lab6_q2 {
    final int i = 5;
    int j = 3;
    public static void main(String[] args){
        lab6_q2 obj=new lab6_q2();
        System.out.println("final modifier variable "+obj.i +" Normal non-static variable "+ obj.j);
        System.out.println("After increment");
        obj.j++;
        System.out.println("final modifier variable "+obj.i +" Normal non-static variable "+ obj.j);
    }
}
