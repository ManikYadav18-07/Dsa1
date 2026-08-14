import java.util.Scanner;
public class PROGRAM {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("===== WELCOME PLEASE ENTER ALL YOURS DETAILS BELOW =====" + "\n");

        System.out.print("YOUR NAME :- ");
        String str = user.nextLine();

        System.out.print("YOUR AGE :- ");
        Integer cs = user.nextInt();

        System.out.print("YOUR CGPA :- ");
        Float cr = user.nextFloat();

        System.out.print("YOUR GRADE :- ");
        Character cp = user.next().charAt(0);

        System.out.println( "\nYOUR DETAILS ARE :-\n");
        System.out.println("NAME :- " + str + "\n" + "AGE :- " + cs + "\n" +  "CGPA :- " + cr + "\n" + "GRADE :- " + cp);
        user.close();
 }   
}
