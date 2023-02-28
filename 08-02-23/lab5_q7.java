import java.util.Scanner;

public class lab5_q7 {
    public static void main(String args[]) {

        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int n = obj.nextInt();

            int rollNo[] = new int[n];
            String name[] = new String[n];
            int s1[] = new int[n];
            int s2[] = new int[n];
            int s3[] = new int[n];
            double avg[] = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter student " + (i + 1) + " details:");
                System.out.print("Roll No: ");
                rollNo[i] = obj.nextInt();
                obj.nextLine();
                System.out.print("Name: ");
                name[i] = obj.nextLine();
                System.out.print("Subject 1 Marks: ");
                s1[i] = obj.nextInt();
                System.out.print("Subject 2 Marks: ");
                s2[i] = obj.nextInt();
                System.out.print("Subject 3 Marks: ");
                s3[i] = obj.nextInt();
                avg[i] = (s1[i] + s2[i] + s3[i]) / 3.0;
            }

            System.out.println("Roll No\tName\tRemark");
            for (int i = 0; i < n; i++) {
                String remark;
                if (avg[i] < 40)
                    remark = "C";
                else if (avg[i] < 60)
                    remark = "B";
                else if (avg[i] < 75)
                    remark = "A";
                else if (avg[i] < 85)
                    remark = "O";
                else
                    remark = "E";
                System.out.println(rollNo[i] + "\t"
                        + name[i] + "\t"
                        + remark);
            }
        }
    }

}