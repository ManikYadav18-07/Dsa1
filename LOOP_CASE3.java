import java.util.Scanner;

public class LOOP_CASE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating the speed with battery :- \n");
        int speed=0;
        System.out.println("Enter batter percentage :- ");
        Integer battery = sc.nextInt();
        for(int i=1;i<=battery;i++){
            if(battery%i==0){
                speed+=i;
            }
        }
        System.out.println("The speed of car according to the battery percentag will be "+speed+" Km/h");
        sc.close();

    }
}
