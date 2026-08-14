import java.util.Scanner;

public class LOOP_CASE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== REGELAR TABLE =====");
        System.out.println("Enter a number to grt it's table :-");
        Integer num1 = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num1+" X "+i+" = "+num1*i);
        }

        System.out.println("===== REVERSE TABLE =====");
        for(int i=10;i>=1;i--){
            System.out.println(num1+" X "+i+" = "+num1*i);
        }
        sc.close();
    }
}
