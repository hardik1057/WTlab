import java.util.Scanner;

public class lab5_q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = in.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("The matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
