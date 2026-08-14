import java.util.Scanner;

public class ARRAY3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array size :- ");
        int len = sc.nextInt();
        int arr[]= new int[len];
        for(int i=0;i<len;i++){
            System.out.print("Enter the value of ["+i+"] element of array :- ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Even number/s in array :- ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    } 
}
