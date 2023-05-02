// import java.util.*;
// public class q1{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter first string- ");
//         String str1 = scanner.nextLine();
//         System.out.print("Enter second string- ");
//         String str2 = scanner.nextLine();
//         //1
//         System.out.print("1)");
//         if (str1.equals(str2)) {
//             System.out.println("Strings are equal");
//         } else {
//             System.out.println("Strings are not equal");
//         }
//         //2
//         System.out.print("2)");
//         if (str2.contains(str1)) {
//             System.out.println("First string is present in second string");
//         } else {
//             System.out.println("First string is not present in second string");
//         }
//         //3
//         System.out.print("3)");
//         str1=str1.trim();
//         str1=str1.toUpperCase();
//         for (int  i=0; i<str1.length(); i++){
//             char c=str1.charAt(i);
//             if (i==0)
//                 System.out.print(c+".");
//             else if(c==' '){
//                 i++;
//                 c=str1.charAt(i);
//                 System.out.print(c+".");
//             }
//         }
//         System.out.println("");
//         //4
//         System.out.print("4)");
//         String finalStr = str1.concat(str2);
//         System.out.println("Final string: " + finalStr);
//         //5
//         System.out.print("5)");
//         String thirdStr = str1.substring(2, 5);
//         System.out.println("Resulting string: " + thirdStr);
//         //6
//         System.out.print("6)");
//         finalStr = finalStr.trim();
//         finalStr = finalStr.toUpperCase();
//         for (int i = 0; i < finalStr.length(); i++) {
//             char c = finalStr.charAt(i);
//             if (i == 0)
//                 System.out.println(c + ".");
//             else if (c == ' ') {
//                 i++;
//                 c = finalStr.charAt(i);
//                 System.out.println(c + ".");
//             }
//         }
//         //7
//         System.out.print("7)");
//         char[] chars = finalStr.toCharArray();
//         Arrays.sort(chars);
//         String sortedStr = new String(chars);
//         System.out.println("String in alphabetical order: " + sortedStr);
//         //8
//         System.out.print("8)");
//         System.out.println("String in uppercase: " + str1.toUpperCase());
//         System.out.println(" String in lowercase: " + str1.toLowerCase());
//         //9
//         System.out.print("9)");
//         System.out.println("Enter the alphabet whose count you want to know:");
//         String se = new String(scanner.next());
//         char d1[] = se.toCharArray();
//         int count = 0;
//         for (int i = 0; i < finalStr.length(); i++) {
//             char c = Character.toLowerCase(finalStr.charAt(i));
//             if (c == d1[0]) {
//                 count++;
//             }
//         }
//         System.out.println(count + " times character was repeated in the concat string ");
//         // //10
//         System.out.print("10)");
//         int vowelsCount = 0;
//         for (int i = 0; i < finalStr.length(); i++) {
//             char c = Character.toLowerCase(finalStr.charAt(i));
//             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                 vowelsCount++;
//             }
//         }
//         System.out.println("Vowels- "+vowelsCount);
//         //11
//         System.out.print("11)");
//         int wordCount = 0;
//         int i = 0;
//         while (i < str1.length()) {
//             while (i < str1.length() && (str1.charAt(i) == ' ' || str1.charAt(i) == '\n' || str1.charAt(i) == '\t')) {
//                 i++;
//             }
//             if (i < str1.length()) {
//                 wordCount++;
//                 while (i < str1.length() && str1.charAt(i) != ' ' && str1.charAt(i) != '\n' && str1.charAt(i) != '\t') {
//                     i++;
//                 }
//             }
//         }
//         System.out.println("Number of words in the string 1- " + wordCount);
//         scanner.close();
//     }
// }
