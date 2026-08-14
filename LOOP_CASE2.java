import java.util.Scanner;

public class LOOP_CASE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adam's Charity");

        System.out.println("Enter for n value from where Adam want to do charity :- ");
        Integer num= sc.nextInt();
        int total_coin=0;

        for(int i=1;i<=num;i++){
            total_coin += i*i;
        }
        System.out.println("Total coin raised :- "+ total_coin);
        sc.close();
        }
}
