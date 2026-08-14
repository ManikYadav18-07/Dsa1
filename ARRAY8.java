import java.util.Scanner;

public class ARRAY8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array size :- ");
        int len = sc.nextInt();
        int arr[]= new int[len];
        for(int i=0;i<len;i++){
            System.out.print("Enter the value of ["+i+"] element of array :- ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate numbers is/are :- ");
        for (int i=0;i<len;i++) {
            for (int j=i+1;j<len;j++) {
                if (arr[i]==arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
        sc.close();
    } 
}
