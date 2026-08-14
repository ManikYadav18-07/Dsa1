import java.util.Scanner;

public class RENT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome for Car Rent :-");
        System.out.println("For first two hour rent is sameafter additional charge of 150 is added after the time :0");
        System.out.println("Enter rent of car :- ");
        Integer rent = sc.nextInt();

        System.out.println("Enter number of hours spend :- ");
        Integer time_spend = sc.nextInt();

        if(time_spend>=2){
            System.out.println("Total Amount : Rs. "+(((time_spend-2)*150) + time_spend*rent));
        }
        else{
            System.out.println("Total Aount : Rs. "+(time_spend*rent));
        }
        System.out.println("Total time spend in minutes :- "+(time_spend*60));
        sc.close();
    }
}
