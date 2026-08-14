import java.util.Arrays;
import java.util.Scanner;

public class ARRAYS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={5,4,6,2,1,7,3};

        Arrays.sort(arr);
        System.out.println("Sorted :- "+Arrays.toString(arr));            /* USED TO SORT */

        int index = Arrays.binarySearch(arr, 4);
        System.out.println("\nNumber found at index := "+ index);               /*USED TO FOUND NUMDER INDEX */

        int arr2[]={3,4,2,5,1,6,7};
        System.out.println("\nArrays equal :-"+Arrays.equals(arr,arr2));      /*USED TO EQUATE THE ARRAY */

        int numbers[] = {10,20,30,40,50};
        System.out.println("\nAfter fill :- "+ Arrays.toString(numbers));     /*USED TO REPLACE THE NUMBERS IN ARRAY */

        int copy[]= Arrays.copyOf(arr, 3);
        System.out.println("\nCopyOf :- "+ Arrays.toString(copy));        /*USED TO COPY WHOLE ARRAY */

        int range[]=Arrays.copyOfRange(arr, 1, 4);
        System.out.println("\nCopyOfRange :- "+ Arrays.toString(range));      /*USED TO COPY NUMBERS BETWEEN A RANGE */

        System.out.println("\nArrays :- "+ Arrays.toString(arr));              /*USED TO PRINT AN ARRAY */
        sc.close();
    }
}
