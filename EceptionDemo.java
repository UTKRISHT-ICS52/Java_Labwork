class ExceptionDemo {
    static void checkNumber(int num) {
        if (num < 0) {
            throw new ArithmeticException("Negative number not allowed");
        }
    }
    public static void main(String[] args) {
        // 1. Arithmetic Exception
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        }

        // 2. Array Index Out Of Bounds
        try {
            int arr[] = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e);
        }

        // 3. Array Store Exception
        try {
            Object x[] = new String[2];
            x[0] = Integer.valueOf(10);   // fixed (modern way)
        } catch (ArrayStoreException e) {
            System.out.println("Array Store Exception caught: " + e);
        }

        // 4. Custom Exception
        try {
            checkNumber(-5);
        } catch (ArithmeticException e) {
            System.out.println("Custom Exception caught: " + e);
        }

        // Finally block
        finally {
            System.out.println("Finally block executed");
        }
    }
}