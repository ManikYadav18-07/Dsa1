import java.util.Scanner;
public class ARRAY_DUPLICATE {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array : ");
	int array_size=sc.nextInt();
	int[] array = new int[array_size];
	for(int i=0;i<array.length;i++){
	    System.out.print("Enter the "+i+" element : ");
	    array[i]=sc.nextInt();    
	}
	int[] duplicate_number_array = new int[array.length];
	int count=0;
	for(int i=0;i<array.length-1;i++){
	    for(int j=i+1;j<array.length;j++){
		if(array[i]==array[j]) {
		    duplicate_number_array[count]=array[i];
		    count+=1;
		    break;
		}
		break;
	    }
	}
	int flag=0;
	int index_value=0;
	for(int i=0;i<array.length;i++){
	    int num=0;
	    int num_1=0;
	    while (duplicate_number_array[i]!=0){
	        num=duplicate_number_array[i]%10;
		num_1=duplicate_number_array[i]/10;
		if(num==num_1+1){
		    flag=1;
		    index_value=i;
		    break;
		}
		duplicate_number_array[i]=duplicate_number_array[i]/10;
	    }
	}
	System.out.print("Duplicate consecutive number in array : "+duplicate_number_array[index_value]);
	sc.close();
    }
}