import java.util.Scanner;

public class NESTED3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :-");
        int num = sc.nextInt();
        int num1=num;
        int rev=0;
        int sum =0;

        while(num1!=0){
            rev =num1%10;
            sum = sum*10 + rev;
            num1 = num1/10;
        }

        if(sum==num){
            System.out.println("it is a palindrom");
        }else{
            System.out.println("not a palindrom.");
        }
        sc.close();
    }
}
