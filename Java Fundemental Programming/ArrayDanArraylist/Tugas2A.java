/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 01 - Desember - 2024
 * Kode program : Array
 */

import javax.swing.JOptionPane;
public class Tugas2A {
    public static void main(String[] args) {
        String[] namaSiswa = new String[5];

        for (int ulang = 0; ulang < namaSiswa.length; ulang++) {
            namaSiswa[ulang] = JOptionPane.showInputDialog("Masukkan nama siswa ke-" + (ulang + 1) + ":");
        }

        for (int ulang2 = 0; ulang2 < namaSiswa.length; ulang2++) {
            System.out.println(namaSiswa[ulang2]);
        }
    } 
}