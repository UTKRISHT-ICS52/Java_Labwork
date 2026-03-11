// Create a class in java 
class Student {
    int id;
    String name;

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}
public class ClassExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 52;
        s.name = "Utkrisht Patel";
        s.display();
    }
}


