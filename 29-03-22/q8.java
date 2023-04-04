class q8 {
    public static void main(String args[]) {
        char chars[] = { 'a', 'b', 'c' };
        String s = new String(chars);
        char c[] = { 'H', 'A', 'R', 'D', 'I','K' };
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);
        byte asci[] = { 115, 65, 107, 98, 69, 110 };
        String s3 = new String(asci);
        System.out.println(s3);
        String s4 = new String(asci, 2, 3);
        System.out.println(s4);
    }
}
