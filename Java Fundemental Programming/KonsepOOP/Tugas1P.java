package KonsepOOP;

class Pustaka {
    private int id;
    private String judul;
    private int jumlah;

    public Pustaka(int id, String judul, int jumlah) {
        this.id = id;
        this.judul = judul;
        this.jumlah = jumlah;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getID() {
        return String.valueOf(id);
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }
}

public class Tugas1P {
    public static void main(String[] args) {
        Pustaka buku = new Pustaka(101, "Habis Gelap Terbitlah Terang", 10);

        System.out.println("ID: " + buku.getID());
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Jumlah: " + buku.getJumlah());
    }
}