package Tugas11.Tugas13KonsepOOP;

public class Bonbin {
    public static void main(String[] args) {
        Binatang[] hewan = {
            new Kucing("Milo"),
            new Gajah("Dumbo"),
            new Burung("Tweety"),
            new Kelinci("Bugs")
        };
        for (Binatang b : hewan) {
            b.info();
        }
    }
}

