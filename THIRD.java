import java.util.Scanner;
public class THIRD {
    public static void main(String[] args) {
        System.out.println("how are you?");
        Scanner userInput = new Scanner(System.in);
        String str = userInput.nextLine();

        System.out.println(str);
        userInput.close();
 }   
}
