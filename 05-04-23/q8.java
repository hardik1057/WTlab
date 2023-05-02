// import java.io.*;

// class q8 {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = null;
//         BufferedReader br = null;
//         FileWriter fw = null;
//         int ch = 0;
//         try {
//             fr = new FileReader("t1.txt");
//             br = new BufferedReader(fr);
//             fw = new FileWriter("t2.txt");
//             ch = br.read();
//             while (ch != -1) {
//                 System.out.println((char) ch);
//                 fw.write((char) ch);
//                 ch = br.read();
//             }

//         } catch (IOException e) {
//             System.out.println(e);
//         } finally {
//             fr.close();
//             br.close();
//             fw.close();
//         }
//     }
// }
