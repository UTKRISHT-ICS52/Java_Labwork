// Vector 
import java.util.Vector;
class Nine {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Car");
        v.add("Bus");
        v.add("Bike");

        for (String item : v) {
            System.out.println(item);
        }
    }
}

