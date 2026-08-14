class Animal1{
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog1 extends Animal1{
    void barks(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal1{
    void meow(){
        System.out.println("Cat meow");
    }
}
public class Inheri_hierarchical {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.eat();
        dog.barks();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
