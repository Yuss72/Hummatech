/* Nama : Yusuf Usman
 * Kelas : X RPL - 1
 * Tanggal : 11 - Desember - 2024
 * Kode Program : Biodata
 */
import javax.swing.JOptionPane;
public class Ujian1 {
    public static void main(String[] args) {
        String namaLengkap = JOptionPane.showInputDialog("Masukkan Nama Lengkap Anda");
        int absen = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nomor Absen Anda"));
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Umur Anda"));
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat Anda");
        String sekolah = JOptionPane.showInputDialog("Masukkan Asal Sekolah Anda");
        long telp = Long.parseLong(JOptionPane.showInputDialog("Nomor Telepon Anda"));
        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Tinggi Badan Anda (Dalam Bentuk CM)"));
        double berat = Double.parseDouble(JOptionPane.showInputDialog("Berat Badan Anda (Dalam Bentuk KG)"));

        // Output
        System.out.println("\n=== Bidodata ===");
        System.out.println("Nama Lengkap\t: " + namaLengkap);
        System.out.println("Nomor Absen\t: " + absen);
        System.out.println("Umur\t\t: " + umur);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Sekolah\t\t: " + sekolah);
        System.out.println("No. Telepon\t: " + telp);
        System.out.println("Tinggi Badan\t: " + tinggi + " cm");
        System.out.println("Berat Badan\t: " + berat + " kg");
    }
}