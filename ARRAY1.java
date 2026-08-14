import java.util.Scanner;

public class ARRAY1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter the value of [" + i + "] element of array: ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements of array: " + sum);
        sc.close();
    }
}