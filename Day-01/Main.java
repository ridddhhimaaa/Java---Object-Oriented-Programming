public class Main {
    public static void main(String[] args) {
        Student student = new Student("Riddhima", 20);

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        student.study();
    }
}