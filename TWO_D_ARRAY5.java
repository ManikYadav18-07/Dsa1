import java.util.Scanner;
public class TWO_D_ARRAY5 {
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
        int largest = arr[0][0]; 
        int smallest = arr[0][0]; 
        for (int i = 0; i < rows; i++) { 
                for (int j = 0; j < cols; j++) { 
                    if (arr[i][j] > largest) { 
                        largest = arr[i][j]; } 
                            if (arr[i][j] < smallest) { 
                                smallest = arr[i][j]; } } } 
                                    System.out.println("Largest number :- " + largest); 
                    System.out.println("Smallest number :- " + smallest); 
                    sc.close(); 
    } 
}
