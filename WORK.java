import java.util.Scanner;

public class WORK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :- ");
        String str = sc.next();
        char arr[]=str.toCharArray();
        char reverse_array[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            reverse_array[i]=arr[arr.length-i-1];
        }
        System.out.print("Reverse array :- " );
        for(int i=0;i<arr.length;i++){
            System.out.print(reverse_array[i]);
        }
        System.out.println();

        int faah=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=reverse_array[i]){
                faah=0;
                break;
            }
        }
        System.out.print("Palindrome :- ");
        if(faah==0){
            System.out.println("It is not");
        }else{
            System.out.println("It is");
        }

        String lowerCase=str.toLowerCase();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                count++;
            }
    }
    System.out.println("Vovels :- "+ count);
    sc.close();
}
}
