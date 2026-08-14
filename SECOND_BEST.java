import java.util.Scanner;

public class SECOND_BEST {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first score: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second score: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third score: ");
        int number3 = sc.nextInt();

        if ((number1 >= number2 && number1 <= number3) ||
            (number1 <= number2 && number1 >= number3)) {
            System.out.println(number1 + " is second largest.");
        }
        else if ((number2 >= number1 && number2 <= number3) ||
                 (number2 <= number1 && number2 >= number3)) {
            System.out.println(number2 + " is second largest.");
        }
        else {
            System.out.println(number3 + " is second largest.");
        }

        sc.close();
    }
}
