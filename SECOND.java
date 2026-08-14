public class SECOND
{
public static void main(String args[])
{
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        
        int sum = x+y;
        int sub = x-y;
        int multiply = x*y;
        int divide = x/y;
        int module = x%y;

        System.out.println("The sum of two number is :- " + sum);
        System.out.println("The sub of two number is :- " + sub);
        System.out.println("The multiply of two number is :- " + multiply);
        System.out.println("The divide of two number is :- " + divide);
        System.out.println("The remender of two number is :- " + module);

}
}
