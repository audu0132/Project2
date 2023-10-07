class P {
    String name;

    public P(String name) {
        this.name = name; // "this" keyword refers to the current object
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.name);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        P person1 = new P("Audu");
        P person2 = new P("karan");

        person1.introduce();
        person2.introduce();
    }
}
