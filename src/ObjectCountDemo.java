class MyClass {
    static int count = 0; // Static variable to count objects

    public MyClass() {
        count++;
        System.out.println("Object created. Count: " + count);
    }
}

public class ObjectCountDemo {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        System.out.println("Total objects created: " + MyClass.count);
    }
}
