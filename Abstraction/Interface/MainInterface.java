// File: MainInterface.java
package Abstraction.Interface;

public class MainInterface {
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();

        g.play();
        p.play();
    }
}
