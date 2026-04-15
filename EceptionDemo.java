class EceptionDemo {

    static void checkNumber(int num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException("Negative number not allowed");
        }
    }

    public static void main(String[] args) {
        try {
            int a = 10 / 0;  // Arithmetic Exception

            int arr[] = new int[3];
            arr[5] = 10;    // ArrayIndexOutOfBoundsException

            Object x[] = new String[2];
            x[0] = new Integer(10);  // ArrayStoreException

            checkNumber(-5);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e);
        } catch (ArrayStoreException e) {
            System.out.println("Array Store Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
