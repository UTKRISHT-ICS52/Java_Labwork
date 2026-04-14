class Animal {
    final void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
