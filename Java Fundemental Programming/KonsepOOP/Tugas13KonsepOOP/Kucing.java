package Tugas11.Tugas13KonsepOOP;

public class Kucing extends Binatang {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println("Kucing makan ikan dan daging.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println("Kucing berkembang biak dengan melahirkan.");
    }

    @Override
    public void hidupDi() {
        System.out.println("Kucing hidup di rumah.");
    }

    @Override
    public void jenisHewan() {
        System.out.println("Kucing adalah hewan mamalia.");
    }
}
