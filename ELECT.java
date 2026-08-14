import java.util.Scanner;

public class ELECT {
    public static void main(String[] args) {
        System.out.println("FIR ELECTRICITY BILL");
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the units :-");
        Integer unit = sc.nextInt();

        if(unit>=0 && unit<=100){
            System.out.println("2/unit bill :- " + unit*2);
        }
        else if(unit>=101 && unit<=200){
            System.out.println("3/unit bill :- "+ ((unit-100)*3+200));
        }
        else{
            System.out.println("5/units :- "+((unit-200)*5+500));
        }
        sc.close();
    }

}
