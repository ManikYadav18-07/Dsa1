import java.util.Scanner;

public class NESTED1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int fact =1;

        for(int i=1;i<=user;i++){
            fact*=i;
        }
        System.out.println("factorial :- "+fact);
        sc.close();
    }
    }
