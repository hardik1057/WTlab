import java.io.*;
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("file1.txt");
            int ch;
            FileOutputStream f2 = new FileOutputStream("file2.txt");
            while ((ch = f1.read()) != -1) {
                f2.write(ch);
            }
            f1.close();
            f2.close();
            FileReader fr = new FileReader("file1.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("file3.txt");
            int c;
            while ((c = br.read()) != -1) {
                fw.write((char) c);
            }
            fr.close();
            fw.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
