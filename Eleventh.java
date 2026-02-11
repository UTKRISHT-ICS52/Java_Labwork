// Type Casting 

class Eleventh{
    public static void main(String[] args) {
        // Widening (automatic)
        int a = 10;
        double b = a;
        System.out.println("Widening: " + b);

        // Narrowing (manual)
        double x = 9.78;
        int y = (int) x;
        System.out.println("Narrowing: " + y);
    }
}

