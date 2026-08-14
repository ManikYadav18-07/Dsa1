class Vechicle{
    void start(){
        System.out.println("Vechicle starts");
    }
}
class Car extends Vechicle{
    void drive(){
        System.out.println("drive the car");
    }
}
class Sports extends Car{
    void boost(){
        System.out.println("boost mode on");
    }
}
public class Inheri_multilevel {
    public static void main(String[] args) {
        Sports sc= new Sports();
        sc.start();
        sc.drive();
        sc.boost();

        Car car = new Car();
        car.drive();
        car.start();
    }
}
