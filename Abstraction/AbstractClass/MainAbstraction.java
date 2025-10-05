package Abstraction.AbstractClass;

public class MainAbstraction {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.displayInfo();
        s1.draw();

        s2.displayInfo();
        s2.draw();
    }
}
