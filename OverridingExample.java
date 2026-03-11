// (Method in child class overrides parent class method) is called method Overriding in Java. 
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

