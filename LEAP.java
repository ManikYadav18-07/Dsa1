import java.util.Scanner;

public class LEAP {
    public static void main(String[] args) {
        System.out.println("Check the year is leap one or not :-");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year:- ");
        Integer year = sc.nextInt();

        if(year%4==0 && year%100 != 0 && year%400==0){
            System.out.println(year+" is leap year");
        }else{
            System.out.println("Not a leap year.");
        }
        sc.close();
    }
}
