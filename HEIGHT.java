import java.util.Scanner;

public class HEIGHT {
    public static void main(String[] args) {
        System.out.println("To check the tallest amoung 3 :-\n");

        System.out.println("Enter first height :-");
         Scanner userInput1 = new Scanner(System.in);
         Integer number1 = userInput1.nextInt();

         System.out.println("Enter second height :-");
         Scanner userInput2 = new Scanner(System.in);
         Integer number2 = userInput2.nextInt();

         System.out.println("Enter third height :-");
         Scanner userInput3 = new Scanner(System.in);
         Integer number3 = userInput3.nextInt();

         if(number1>number2){
            if(number1>number3){
                System.out.println(number1+" is tallest than "+ number2+" and "+number3);
            }
         }
         else if (number2>number3){
            System.out.println(number2+" is tallest than both ");
         }
         else{
            System.out.println(number3+" is tallest than both.");
         }
         userInput1.close();
         userInput2.close();
         userInput3.close();
    }
}
