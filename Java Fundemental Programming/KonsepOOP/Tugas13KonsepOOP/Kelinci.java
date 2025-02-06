package Tugas11.Tugas13KonsepOOP;

public class Kelinci extends Binatang {

    public Kelinci(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println("Kelinci makan sayuran dan buah.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println("Kelinci berkembang biak dengan melahirkan.");
    }

    @Override
    public void hidupDi() {
        System.out.println("Kelinci hidup di ladang dan padang rumput.");
    }

    @Override
    public void jenisHewan() {
        System.out.println("Kelinci adalah hewan mamalia.");
    }
}

