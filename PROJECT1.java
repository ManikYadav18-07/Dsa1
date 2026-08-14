import java.util.Scanner;
public class PROJECT1 {
    public static void main(String[] args) {
        System.out.println("welcome"+"\n"+"What is your name?");
        Scanner fresh= new Scanner(System.in);
        String name = fresh.nextLine();
        System.out.println("Hi "+ name);
        
        System.out.println("\n"+"So which membership you want to ready for.We hare two facilities :-"+"\n"+"1. Monthly Membership"+"\n"+"2. Yearly Membership"+"\n"+"Which one you want to choose?");
        String wish = fresh.nextLine();
        System.out.println("\n"+"You choose :- ");
        System.out.println(wish);

        System.out.println("\n"+"Thank you for Taking Membership." + "\n" + "See you soon....");
        
        fresh.close();
 }   
}