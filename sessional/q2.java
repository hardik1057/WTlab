
// wapp in java to create a user defined exception blankcharacterexception and the program will take input 2 strings from keyboard and convert to upper case
// and lowercase and will catch the exception if no input is given 
import java.util.Scanner;

public class q2 {

    static class BlankCharacterException extends Exception {
        public BlankCharacterException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first string: ");
            String str1 = scanner.nextLine();
            if (str1.isEmpty()) {
                throw new BlankCharacterException("No input was given for the first string!");
            }
            String upperCase1 = str1.toUpperCase();
            String lowerCase1 = str1.toLowerCase();
            System.out.println("Upper case of the first string: " + upperCase1);
            System.out.println("Lower case of the first string: " + lowerCase1);

            System.out.print("\nEnter the second string: ");
            String str2 = scanner.nextLine();
            if (str2.isEmpty()) {
                throw new BlankCharacterException("No input was given for the second string!");
            }
            String upperCase2 = str2.toUpperCase();
            String lowerCase2 = str2.toLowerCase();
            System.out.println("Upper case of the second string: " + upperCase2);
            System.out.println("Lower case of the second string: " + lowerCase2);
        } catch (BlankCharacterException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
