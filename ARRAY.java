import java.util.Scanner;

public class ARRAY {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array size :- ");
        int len = sc.nextInt();
        int arr[]= new int[len];
        for(int i=0;i<len;i++){
            System.out.print("Enter the value of ["+i+"] element of array :- ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr);
        }
        sc.close();
    } 
}
