interface project_Table{
    void project();
}
interface print_Table{
    void print();
}
class MyProject implements print_Table,project_Table{
    public void project(){
        System.out.println("Projecting");
    }
    public void print(){
        System.out.println("Print");
    }
}
public class Inheri_multiple {
    public static void main(String[] args) {
        MyProject obj = new MyProject();
        obj.project();
        obj.print();
    }
}
