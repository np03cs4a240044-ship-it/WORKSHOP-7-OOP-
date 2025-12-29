package workshop7;

class Student1 {
    public String name;
    public int age;

    // Constructor
    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class student {
    public static void main(String[] args) {
        Student1 s = new Student1("Alex", 20);

        // Now you can use the getters:
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

