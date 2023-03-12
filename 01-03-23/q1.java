import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.nio.Buffer;

public class q1 {
    class twodimension {
        int l, b;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        void getdata() throws IOException {
            l = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
        }

        void cost() {
            int price = 40 * l * b;
            System.out.println("Cost of sheet: " + price);
        }
    }

    class threedimension extends twodimension {
        int h;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        void getdata() throws IOException {
            super.getdata();
            h = Integer.parseInt(br.readLine());
        }

        void cost() {
            super.cost();
            int c1 = 60 * h * super.l * super.b;
            System.out.println("Cost of toy: " + c1);
        }
    }

    public static void main(String[] args) throws IOException {
        q1 obj = new q1();
        threedimension td = obj.new threedimension();
        td.getdata();
        td.cost();
    }
}
