class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }
}

public class ObjectCopyDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Sachin", 101);
        Student student2 = new Student("Vaibhav", 102);

        System.out.println("Before Copy:");
        student1.display();
        student2.display();


        student2.name = student1.name;
        student2.rollNumber = student1.rollNumber;

        System.out.println("After Copy:");
        student1.display();
        student2.display();
    }
}
