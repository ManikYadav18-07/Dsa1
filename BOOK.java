import java.util.Scanner;

class info{
    private String author;
    private String title;
    private boolean available;
    info(String title, String author){
        this.title=title;
        this.author=author;
    }
    public void BookAvilable(String title, String author){
        if((title==this.title)&& (author==this.author)){
            this.available=true;
        }else{
            this.available=false;
        }
    }
    public void borrowBook() {
        if(this.available==true){
            System.out.println("You can borrow it.");
        }else{
            System.out.println("You cann't borrow it.");
        }
    }
    public void returnBook(){
        System.out.println("Thanks for returning the book on time.");
        this.available=true;
    }
}
public class BOOK {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    // System.out.print("Enter book name :- ");
    // String bookName= sc.nextLine();
    // System.out.print("Enter author name :- ");
    // String authorName= sc.nextLine();

    info b1= new info("To Kill a Mockingbird" , "Harper Lee");
    b1.BookAvilable("To Kill a Mockingbird" , "Harper Lee");
    b1.borrowBook();

    info b2= new info("Godan" ,"Munshi Premchand");
    b2.BookAvilable("Godan" , "Munshi Premchand");
    b2.borrowBook();

    info b3= new info("War & Peace" , "Leo Tolstoy");
    b3.BookAvilable("War and Peace" , "Leo Tolstoy");
    b3.borrowBook();
    sc.close();
   }
}
