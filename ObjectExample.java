// Create a Object in java class 
class Car {
    String brand = "Defender";
    int speed = 220;
}
public class ObjectExample {
    public static void main(String[] args) {
        Car c1 = new Car();   // object creation
        System.out.println("Brand: " + c1.brand);
        System.out.println("Speed: " + c1.speed);
    }
}
