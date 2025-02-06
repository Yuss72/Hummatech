package Tugas11.Tugas13KonsepOOP;

public abstract class Binatang  {
    protected String nama;

    public Binatang(String nama) {
        this.nama = nama;
    }

    public abstract void makan();
    public abstract void berkembangBiak();
    public abstract void hidupDi();
    public abstract void jenisHewan();
    
    public void info() {
        System.out.println("Nama Binatang: " + nama);
        makan();
        berkembangBiak();
        hidupDi();
        jenisHewan();
        System.out.println("====================================");
    }
}
