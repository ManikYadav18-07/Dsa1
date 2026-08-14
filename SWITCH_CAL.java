import java.util.Scanner;

public class SWITCH_CAL {
    public static void main(String[] args) {
        System.out.println("Calculator :-");
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number :-");
        Integer num1 = sc.nextInt();

        System.out.println("Enter second number :-");
        Integer num2 = sc.nextInt();

        System.out.println("Enter any symbol + - * / % =>");
        Character chr = sc.next().charAt(0);

        switch (chr) {
            case '+': System.out.println("sum :- "+(num1+num2));
            break;
            case '-': System.out.println("sub"+(num1-num2));
            break;
            case '*': System.out.println("multi :- "+(num1*num2));
            break;
            case '/': System.out.println("divide :- "+(num1/num2));
            break;
            case '%': System.out.println("module :- "+(num1%num2));
                break;
        
            default:System.out.println("Invalid input");
                break;
        }
        sc.close();

    }
}
