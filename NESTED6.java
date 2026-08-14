import java.util.Scanner;

public class NESTED6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Digit counter :-");
        int count =0;
        int nums = sc.nextInt();

        while(nums!=0){
            nums/=10;
            count= count + 1;
        }
        System.out.println("Number of digits = " + count);*/



        System.out.println("Sum of digit :- ");
        int sum =0;
        int nums = sc.nextInt();

        while(nums!=0){
            int rem = nums%10;
            sum= sum+rem;
            nums/=10;
        }
        System.out.println("sum of digits :- "+sum);
        sc.close();
    }   
}

