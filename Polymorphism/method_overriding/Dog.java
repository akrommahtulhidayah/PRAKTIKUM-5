package Polymorphism.method_overriding;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Anjing menggonggong: Guk! Guk!");
    }
}
