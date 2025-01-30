/* Nama : Yusuf Usman
 * Kelas : X RPL - 1
 * Tanggal : 11 - Desember - 2024
 * Kode Program : Menghitung Volume Balok
 */

import javax.swing.JOptionPane;
public class Ujian3 {
    public static void main(String[] args) {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang Balok"));
        int l = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar Balok"));
        int t = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi Balok"));

        double volume = p * l * t;

        // Output
        System.out.println("Panjang = " + p + "\nLebar = " + l + "\nTinggi = " + t);
        System.out.println("\nRumus = V = p x l x t");
        System.out.println("\nVolume = " + volume);
    }
}
