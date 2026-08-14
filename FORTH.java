import java.util.Scanner;
public class FORTH {
    public static void main(String[] args) {
        System.out.println("YES! WHAT YOU NEED COFFEE ;)");
        Scanner userInput = new Scanner(System.in);
        String str = userInput.nextLine();
        str= "i need coffee too";
        System.out.println(str+"\n"+str+"\n"+str);
        userInput.close();
 }   
}