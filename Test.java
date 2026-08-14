import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n = 100, n2=100;
        if(n==n2){
            System.out.println("Equal");
        }else{
            System.out.println("not equal");
        }*/
       String str1="Hello";
       String str2=new String("Hello");
       String str3="Hello";
       if(str1==str2){
        System.out.println("str1=str2");
       }else{
        System.out.println("str1!=str2");
       }
       if(str2==str3){
        System.out.println("str2=str3");
       }else{
        System.out.println("str2!=str3");
       }if(str1==str3){
        System.out.println("str1=str3");
       }else{
        System.out.println("str1!=str3");
       }
       if(str1.equals(str2)){
        System.out.println("str1=str2");
       }else{
        System.out.println("str1!=str2");
       }
       if(str2.equals(str3)){
        System.out.println("str2=str3");
       }else{
        System.out.println("str2!=str3");
       }if(str1.equals(str3)){
        System.out.println("str1=str3");
       }else{
        System.out.println("str1!=str3");
       }
        sc.close();
    }
}
