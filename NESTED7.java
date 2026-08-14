import java.util.Scanner;

public class NESTED7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series :- ");
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("0 ");
        }else if(num == 2){
            System.out.println("0 1 ");
        }else{
            System.out.print("0 1 ");
            int x =0;
            int y = 1;
            for(int i = 3; i<=num;i++){
                int sum = x+y;
                System.out.print(sum +" ");
                x=y;
                y=sum;
            }
        }
        sc.close();
    }
}
