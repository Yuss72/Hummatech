package KonsepOOP;

class Mobil {
    private double kecepatan;
    private int roda;
    private String tipe;

    public Mobil(double kecepatan, int roda, String tipe) {
        this.kecepatan = kecepatan;
        this.roda = roda;
        this.tipe = tipe;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getRoda() {
        return roda;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }

    public void output() {
        System.out.println("Spesifikasi Mobil Avanza:");
        System.out.println("Kecepatan: " + getKecepatan() + " km/h");
        System.out.println("Roda: " + getRoda());
        System.out.println("Tipe: " + getTipe());        
    }
}

public class Tugas2P {
    public static void main(String[] args) {
        Mobil avanza = new Mobil(270, 4, "CUV");
        
        avanza.output();
    }
}
