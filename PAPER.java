import java.util.Scanner;

public class PAPER {
    public static void main(String[] args) {
        System.out.println("Choose one: Rock, Paper, or Scissor");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice: ");
        String name = sc.next();

        if (name=="paper") {
            System.out.println("Scissor");
            System.out.println("You lose");
        }
        else if (name=="rock") {
            System.out.println("Paper");
            System.out.println("You lose");
        }
        else if (name=="scissor") {
            System.out.println("Rock");
            System.out.println("You lose");
        }
        else {
            System.out.println("Choose wisely");
        }

        sc.close();
    }
}
