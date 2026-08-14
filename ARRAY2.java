import java.util.Scanner;

public class ARRAY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        int arr1[]=new int[len];


        for (int i = 0; i < len; i++) {
            System.out.print("Enter the value of [" + i + "] element of array: ");
            arr[i] = sc.nextInt();
        }
       for (int i = 0; i < len; i++) {
            arr1[i] = arr[i];
        }

        System.out.println("First Array:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSecond Array:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr1[i] + " ");
        }
        sc.close();
    }
}
