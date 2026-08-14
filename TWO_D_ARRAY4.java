import java.util.Scanner;

public class TWO_D_ARRAY4 {
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

        int flag=1;

        if (rows!=cols) {
            flag=0;
        } else {
            for (int i=0;i<rows;i++) {
                for (int j=0;j<cols;j++) {

                    if (arr[i][j]!=arr[j][i]) {
                        flag=0;
                    }
                }
            }
        }

        if (flag==1) {
            System.out.println("Matrix is Symmetrical");
        } else {
            System.out.println("Matrix is Not Symmetrical");
        }

        sc.close();
    }
}
