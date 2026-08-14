/*lass name{
    private String name;
    private int age;
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getAge(){return age;}
    public void setAge(int age){this.age=age;}
}
public class Encapuslation1 {
    public static void main(String[] args) {
        name p = new name();
        p.setName("Manik");
        p.setAge(19);
        System.out.println("Name :- "+p.getName());
        System.out.println("Age :-"+p.getAge());
    }
}*/

class main{
    private long Acc_Name;
    private String Name;
    private String Email;
    private int Age;
    private float Amount;

    public long getAcc_Name(){return Acc_Name;}
    public void setAcc_Name(long Acc_Name){this.Acc_Name=Acc_Name;}
    public String getName(){return Name;}
    public void setName(String Name){this.Name=Name;}
    public String getEmail(){return Email;}
    public void setEmail(String Email){this.Email=Email;}
    public int getAge(){return Age;}
    public void setAge(int Age){this.Age=Age;}
    public float getAmount(){return Amount;}
    public void setAmount(float Amount){this.Amount=Amount;}
}
public class Encapuslation1{
    public static void main(String[] args) {
        main acc = new main();
        acc.setAcc_Name(83747384L);
        acc.setName("Manik");
        acc.setEmail("manik_25ds131@saitm.ac.in");
        acc.setAge(19);
        acc.setAmount(4345133f);

        System.out.println("Account Number :- "+acc.getAcc_Name());
        System.out.println("Name :- "+acc.getName());
        System.out.println("Email :- "+acc.getEmail());
        System.out.println("Age :- "+acc.getAge());
        System.out.println("Amount :- "+acc.getAmount());

    }
}