import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        System.out.println("Give a number to check either it is even or odd :-");
         Scanner userInput = new Scanner(System.in);
         Integer number = userInput.nextInt();
         if(number % 2 == 0){
            System.out.println(number+" is even");
         }
         else{
            System.out.println(number+" is odd");
         }
        userInput.close();
    }
}
