package Polymorphism.method_overriding;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Kucing mengeong: Meong! Meong!");
    }
}
