import java.util.Scanner;

public class PRIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To checking the item is primear or not by item name :- ");
        Integer id = sc.nextInt();

        if(id==1){
            System.out.println("Regular Product");
        }else{
            int count=0;
            for(int i=2;i<id;i++){
                if(id%i==0){
                    count+=1;
                    break;
                }
            }
            if(count==0){
                System.out.println("Premium Product");
            }else{
                System.out.println("Regular Product");
            }
        }
        sc.close();
    }
}
