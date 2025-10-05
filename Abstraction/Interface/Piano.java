// File: Piano.java
package Abstraction.Interface;

public class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Memainkan piano dengan menekan tuts.");
    }
}
