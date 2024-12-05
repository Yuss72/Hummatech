/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : ?
 * Kode program : Operator Pemrograman
 */

import javax.swing.JOptionPane;

public class Tugas5R {
    public static void main(String[] args) {
        
        // Jumlah barang sisa di toko
        int sirup = 5;
        int deterjen = 6;
        int mieInstan = 10;

        // Input menambahkan jumlah barang
        int sirupBaru = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah sirup yang akan ditambahkan"));
        int deterjenBaru = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah deterjan yang akan ditambahkan"));
        int mieInstanBaru = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah mie instan yang akan ditambahkan"));

        // Output
        System.out.println("\n=== Output ===");
        System.out.println("Sirup\t\t: " + (sirup + sirupBaru));
        System.out.println("Deterjen\t: " + (deterjen + deterjenBaru));
        System.out.println("Mie Instan\t: " + (mieInstan + mieInstanBaru));
    }    
}