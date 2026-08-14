class Animal{
    void sleep(){
        System.out.println("sleeping");
    }
}
class Dog extends Animal{
        void speak(){
            System.out.println("Dog barks");
        }
        
    }
public class Inheri_simple {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep();
        dog.speak();
    }
}
