/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 21  - November - 2024
 * Kode program : Input dan Output
 */

package Tantangan;
import javax.swing.JOptionPane;
public class SimulasiUjianInputOutput {
    public static void main(String[] args) {
        String namaLengkap = JOptionPane.showInputDialog(null, "Masukkan nama lengkap anda");
        int nisn = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan NIS anda"));
        String kelamin = JOptionPane.showInputDialog(null, "Masukkan Jenis Kelamin Anda"); 
        int umur = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan umur anda"));
        String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat anda");
        int tanggalHari = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Tanggal Hari Lahir anda"));
        int tanggalBulan = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Tanggal Bulan Lahir anda"));
        int tanggalTahun = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Tanggal Tahun Lahir anda"));

        System.out.println("=== Output ===");
        System.out.println("Nama\t\t = " + namaLengkap);
        System.out.println("NISN\t\t = " + nisn);
        System.out.println("Jenis Kelamain\t = " + kelamin);
        System.out.println("Umur\t\t = " + umur);
        System.out.println("Alamat\t\t = " + alamat);
        System.out.println("Tanggal Lahir\t = " + tanggalHari + " - " + tanggalBulan + " - " + tanggalTahun);
    }
}
