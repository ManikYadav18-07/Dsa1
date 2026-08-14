import java.util.Scanner;
public class ARRAY_DUPLICATE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size :- ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        for (int i=0;i<len;i++) {
            System.out.print("Enter the value of [" + i + "] element :- ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The consecutive number is duplicate in array is :- ");
        for(int i=0;i<len;i++){
           for(int j=i-1;j<len;j++){
              if(arr[i]==arr[j]&&j==i+1){ 
                 System.out.print(arr[i] + " ");
                  }
             }
         }
        sc.close();
    }
}