// 	Wrapper Class

class Tenth {
    public static void main(String[] args) {
        int num = 10;

        Integer obj = Integer.valueOf(num);  // primitive to object
        int newNum = obj.intValue();         // object to primitive

        System.out.println("Wrapper Object: " + obj);
        System.out.println("Primitive Value: " + newNum);
    }
}
