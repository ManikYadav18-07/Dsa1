import java.util.Scanner;

public class TWO_D_ARRAY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :- ");
        int rows = sc.nextInt();
        
        System.out.print("Enter number of columns :- ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                System.out.print("Enter value of [" + i + "][" + j + "] :- ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target value :- ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                if (arr[i][j]==target) {
                    found = true;
                }
            }
        }
        if (found == true) {
            System.out.println("Target found");
        } else {
            System.out.println("Target not found");
        }
        sc.close();
    }
}
