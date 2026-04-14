class Person {
    private int age;   // hidden data

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(21);
        System.out.println(p.getAge());
    } 
}
