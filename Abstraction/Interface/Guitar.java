// File: Guitar.java
package Abstraction.Interface;

public class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Memainkan gitar dengan petikan senar.");
    }
}
