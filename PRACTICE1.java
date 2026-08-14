import java.util.Scanner;

public class PRACTICE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String For 'A' :- ");
        String str1 = sc.next();
        System.out.println("Enter The String For 'B' :- ");
        String str2 = sc.next();

        System.out.println("The sum of length of both string are :- "+(str1.length())+(str2.length()));

        if (str1.compareTo(str2) > 0) {
            System.out.println("Its is a LEXICOGRAPHICALLY.");
        } else {
            System.out.println("No it is not a LEXICOGRAPHICALLY.");
        }

        String newStr1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        String newStr2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);

        System.out.println(newStr1 + " " + newStr2);

        sc.close();
    }
}