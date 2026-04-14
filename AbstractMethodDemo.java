abstract class Shape {
    abstract void draw();  // no body
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
public class AbstractMethodDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}

