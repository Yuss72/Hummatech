package Tugas11.Tugas13KonsepOOP;

public class Burung extends Binatang {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println("Burung makan biji-bijian dan serangga.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println("Burung berkembang biak dengan bertelur.");
    }

    @Override
    public void hidupDi() {
        System.out.println("Burung hidup di pohon dan udara.");
    }

    @Override
    public void jenisHewan() {
        System.out.println("Burung adalah hewan aves.");
    }
}

