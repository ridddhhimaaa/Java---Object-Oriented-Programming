class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Riddhima", 21);
        Student student2 = new Student("Aarav", 20);

        student1.displayInfo();
        student2.displayInfo();
    }
}
