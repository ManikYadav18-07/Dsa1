import java.util.Scanner;

public class ARRAY6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int len = sc.nextInt();
        int arr[] = new int[len];

        for (int i=0;i<len;i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int num = 1;
        for (int i=0;i<len/2;i++) {
            if (arr[i]!=arr[len-1-i]) {
                num=0;
                break;
            }
        }
        if (num==1) {
            System.out.println("Palindrome Array");
        } else {
            System.out.println("Not a Palindrome Array");
        }

        sc.close();
    }
}