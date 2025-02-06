import javax.swing.JOptionPane;

// Superclass Timbangan
class Timbangan {
    // Method overloading untuk tipe data double
    public double hitung(double berat, double tinggi, int jenisKelamin) {
        if (jenisKelamin == 1) { // Pria
            return berat - (tinggi - 100) - ((tinggi - 100) * 0.1);
        } else { // Wanita
            return berat - (tinggi - 100) - ((tinggi - 100) * 0.15);
        }
    }

    // Method overloading untuk tipe data int
    public int hitung(int berat, int tinggi, int jenisKelamin) {
        if (jenisKelamin == 1) { // Pria
            return berat - (tinggi - 100) - ((tinggi - 100) * 0.1);
        } else { // Wanita
            return berat - (tinggi - 100) - ((tinggi - 100) * 0.15);
        }
    }

    public void hasil() {
        JOptionPane.showMessageDialog(null, "Hasil perhitungan berat badan ideal.");
    }
}

// Subclass TimbanganDigital
class TimbanganDigital extends Timbangan {
    private double berat;
    private double tinggi;
    private double hasil;

    public double hitung(double berat, double tinggi, int jenisKelamin) {
        this.berat = berat;
        this.tinggi = tinggi;
        this.hasil = super.hitung(berat, tinggi, jenisKelamin);
        return this.hasil;
    }

    public void hasil() {
        JOptionPane.showMessageDialog(null, "Berat Badan Ideal (Digital): " + String.format("%.2f", hasil) + " kg");
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public void cekGolongan() {
        if (hasil < 0) {
            JOptionPane.showMessageDialog(null, "Anda perlu menurunkan berat badan.");
        } else if (hasil == 0) {
            JOptionPane.showMessageDialog(null, "Berat badan Anda sudah ideal.");
        } else {
            JOptionPane.showMessageDialog(null, "Anda perlu menambah berat badan.");
        }
    }
}

// Subclass TimbanganAnalog
class TimbanganAnalog extends Timbangan {
    private int berat;
    private int tinggi;
    private int hasil;

    public int hitung(int berat, int tinggi, int jenisKelamin) {
        this.berat = berat;
        this.tinggi = tinggi;
        this.hasil = super.hitung(berat, tinggi, jenisKelamin);
        return this.hasil;
    }

    public void hasil() {
        JOptionPane.showMessageDialog(null, "Berat Badan Ideal (Analog): " + hasil + " kg");
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getBerat() {
        return berat;
    }
}

// Main class
public class Tugas12P {
    public static void main(String[] args) {
        int jenisKelamin = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jenis kelamin (1 untuk Pria, 2 untuk Wanita):"));
        String pilihanTimbangan = JOptionPane.showInputDialog("Pilih jenis timbangan (1 untuk Digital, 2 untuk Analog):");

        if (pilihanTimbangan.equals("1")) {
            double berat = Double.parseDouble(JOptionPane.showInputDialog("Masukkan berat badan (kg):"));
            double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi badan (cm):"));

            TimbanganDigital timbanganDigital = new TimbanganDigital();
            timbanganDigital.hitung(berat, tinggi, jenisKelamin);
            timbanganDigital.hasil();
            timbanganDigital.cekGolongan();
        } else if (pilihanTimbangan.equals("2")) {
            int berat = Integer.parseInt(JOptionPane.showInputDialog("Masukkan berat badan (kg):"));
            int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi badan (cm):"));

            TimbanganAnalog timbanganAnalog = new TimbanganAnalog();
            timbanganAnalog.hitung(berat, tinggi, jenisKelamin);
            timbanganAnalog.hasil();
        } else {
            JOptionPane.showMessageDialog(null, "Pilihan tidak valid!");
        }
    }
}