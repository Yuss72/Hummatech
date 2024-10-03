import javax.swing.JOptionPane;

public class Tugas4L {
    public static void main(String[] args) {
        // Input
        String namaLengkap = JOptionPane.showInputDialog(null, "Masukkan nama lengkap anda");
        int nis = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan NIS anda"));
        int umur = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan umur anda"));

        // Outpur
        System.out.println("\n==== Output ====");
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("NIS: " + nis);
        System.out.println("Umur: " + umur + " tahun");
    }
}
