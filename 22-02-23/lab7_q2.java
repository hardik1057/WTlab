import java.util.Scanner;

public class lab7_q2{
    private int[] arr;
    private int n;
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    public void swap() {
        int minIndex = 0, maxIndex = 0;
        int min = arr[0], max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            } else if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
    public void display() {
        System.out.println("The updated array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        lab7_q2 num = new lab7_q2();
        num.read();
        num.swap();
        num.display();
    }
}
