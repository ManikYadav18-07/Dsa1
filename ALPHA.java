import java.util.Scanner;

public class ALPHA {
    public static void main(String[] args) {
        System.out.println("Enter an alphabet to check :-");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter alphabet:-");
        Character chara = sc.next().charAt(0);

        if((chara >='A' && chara<='Z') || (chara>='a' && chara<='z')){
            if(chara=='a' || chara=='e' || chara=='i' || chara=='o' || chara=='u' || chara=='A' || chara=='E' || chara=='I' || chara=='O' || chara=='U'){
                System.out.println(chara +" is vowel.");
            }else{
                System.out.println(chara +" is consnant.");
            }
        }
        else{
            System.out.println("Not an alphabet");
            sc.close();
        }
    }
}
