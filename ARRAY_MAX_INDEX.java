import java.util.Scanner;
public class ARRAY_MAX_INDEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size :- ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        for (int i=0;i<len;i++) {
            System.out.print("Enter the value of [" + i + "] element :- ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int index = 0;
        for (int i=1;i<len;i++) {
            if (arr[i]>max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Largest element :- " + max);
        System.out.println("Index number of largest element :- " + index);
        sc.close();
    }
}