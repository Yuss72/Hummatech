import javax.swing.JOptionPane;

class Karyawan {
    private String nama;
    private double gaji;
    private final double PERSENTASE_KENAIKAN = 0.10;

    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void naikkanGaji() {
        gaji += (gaji * PERSENTASE_KENAIKAN);
    }
}

class Manager extends Karyawan {
    private double bonus;

    public Manager(String nama, double gaji) {
        super(nama, gaji);
    }

    // Method overriding
    @Override
    public double getGaji() {
        return super.getGaji() + bonus;
    }

    // Getter dan Setter bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

public class Tugas11P {
    public static void main(String[] args) {
        // Input menggunakan JOptionPane
        String nama = JOptionPane.showInputDialog("Masukkan nama Manager:");
        double gaji = Double.parseDouble(JOptionPane.showInputDialog("Masukkan gaji pokok:"));
        double bonus = Double.parseDouble(JOptionPane.showInputDialog("Masukkan bonus:"));
        
        // Membuat objek Manager
        Manager manager = new Manager(nama, gaji);
        manager.setBonus(bonus);
        
        // Sebelum kenaikan gaji
        String infoSebelum = "Informasi Sebelum Kenaikan:\n" +
                            "Nama: " + manager.getNama() + "\n" +
                            "Gaji Pokok: " + manager.getGaji() + "\n" +
                            "Total Gaji: " + manager.getGaji();
        
        // Melakukan kenaikan gaji
        manager.naikkanGaji();
        
        // Setelah kenaikan gaji
        String infoSesudah = "\n\nInformasi Setelah Kenaikan 10%:\n" +
                            "Nama: " + manager.getNama() + "\n" +
                            "Gaji Pokok: " + manager.getGaji() + "\n" +
                            "Total Gaji: " + manager.getGaji();
        
        JOptionPane.showMessageDialog(null, infoSebelum + infoSesudah);
    }
}