class Calculator {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
public class MethodExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(52, 42);
    }
}

