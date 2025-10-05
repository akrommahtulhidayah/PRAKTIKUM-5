package Polymorphism.method_overriding;

public class MainOverriding {
    public static void main(String[] args) {
        Animal hewan1 = new Dog();
        Animal hewan2 = new Cat();

        hewan1.sound();
        hewan2.sound();
    }
}
