// /* WAP in java which will read Student roll, name, subject, marks from keyboard  * and store in a file called student.txt. Open the file and read the data */
// import java.util.Scanner;
// import java.io.*;

// public class q1 {
//     public static void main(String[] args){
//         try{
//             Scanner obj=new Scanner(System.in);
//             System.out.println("Enter the student roll number:");
//             int roll=obj.nextInt();
//             System.out.println("Enter the name of the Student:");
//             String name=obj.next();
//             System.out.println("Enter the marks scored by the Student:");
//             int marks=obj.nextInt();
//             FileWriter file=new FileWriter("text1.txt");
//             file.write("Roll number of the student is:"+roll+"\n");
//             file.write("Name of the Student is:"+name+"\n");
//             file.write("Marks Scored by the student is:"+marks+"\n");
//             file.close();
//             FileInputStream obj2=new FileInputStream("text1.txt");
//             int ch;
//             while((ch=obj2.read())!=-1){
//                 System.out.print((char)ch);
//             }
//             obj2.close();
//         }
//         catch(IOException e){
//             System.out.println("Error: "+e.getMessage());
//         }
//     }
// }
