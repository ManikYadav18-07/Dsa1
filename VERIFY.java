import java.util.Scanner;

public class VERIFY {
    public static void main(String[] args) {
        System.out.println("Enter your username and password for verifing them :-");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Username:-");
        String str = userInput.nextLine();
        System.out.println("Password:-");
        Integer pass = userInput.nextInt();

        if((str.equals("Manik123@gmail.com")) && (pass==123)){
            System.out.println("Match");
        }else{
            System.out.println("Check again");
        }

        userInput.close();
    }
}
