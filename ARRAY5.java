import java.util.Scanner;

public class ARRAY5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array size :- ");
        int len = sc.nextInt();
        int arr[]= new int[len];
        for(int i=0;i<len;i++){
            System.out.print("Enter the value of ["+i+"] element of array :- ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array :- ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\nMaximum element = " + max);
        sc.close();
    } 
}
