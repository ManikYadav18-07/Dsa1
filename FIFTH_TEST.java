import java.util.Scanner;
public class FIFTH_TEST {
    public static void main(String[] args) {
       Scanner scr = new Scanner(System.in);
       int age = scr.nextInt();
       scr.nextLine();
       String name = scr.nextLine();
       System.out.println(name + age);
       scr.close();
 }   
}