package Tugas11.Tugas13KonsepOOP;

public class Gajah extends Binatang {

    public Gajah(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println("Gajah makan rumput dan daun.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println("Gajah berkembang biak dengan melahirkan.");
    }

    @Override
    public void hidupDi() {
        System.out.println("Gajah hidup di padang rumput dan hutan.");
    }

    @Override
    public void jenisHewan() {
        System.out.println("Gajah adalah hewan mamalia.");
    }
}

