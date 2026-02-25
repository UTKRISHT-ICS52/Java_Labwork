// Break and Continue Statements in java 
public class BranchExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}

