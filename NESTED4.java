import java.util.Scanner;

public class NESTED4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }*/

            /*for(int i=1;i<4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" *");
                }
                System.out.println("\n");
            }*/


            /*for(int i=4;i>=1;i--){
                for(int j=i;j>=1;j--){
                    System.out.print(" *");
                }
                System.out.println("\n");
            }*/


            /*for(int i=1;i<5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" 1");
                }
                System.out.println("\n");
            }  */


            /*for(int i=1;i<4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" "+j);
                }
                System.out.println("\n");
            }*/
           
                
            /*for(int i=1;i<5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" "+i);
                }
                System.out.println("\n");
            }*/


            /*int sum=0;
            for(int i=1;i<5;i++){
                for(int j=1;j<=i;j++){
                    sum=sum+1;
                    System.out.print(" "+sum);
                }
                System.out.println("\n");
            }*/



            for(int i=1;i<=4;i++){
                for(int j=1;j<=i;j++){
                    if(i==1|| i==4){
                    System.out.print("* * * *");
                    break;
                }else if( j==1|| j==4){
                    System.out.print("*     *");
                }
            }
                System.out.print("\n");
            }
        sc.close();
    }
}
