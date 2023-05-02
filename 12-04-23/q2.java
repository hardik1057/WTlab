
// /*WAP which reads two files simultaneously and display on the monitor.*/
// import java.io.*;
// public class q2 {
//     public static void main(String[] args) {
//         try {
//             FileInputStream file1 = new FileInputStream("file1.txt");
//             FileInputStream file2 = new FileInputStream("file2.txt");
//             while (true) {
//                 int c1 = file1.read();
//                 int c2 = file2.read();
//                 if (c1 == -1 && c2 == -1) {
//                     break;
//                 }
//                 System.out.print((char) c1 + "\t" + (char) c2 + "\n");
//             }
//             file1.close();
//             file2.close();
//         } catch (IOException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }