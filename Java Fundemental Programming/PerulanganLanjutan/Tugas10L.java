/* 
* Nama : Yusuf Usman
* Kelas : X RPL 1
* Tanggal : 13  - November - 2024
* Kode program : Pengualangan
*/

package PerulanganLanjutan;
import java.util.Scanner;
 
public class Tugas10L {
    public static void main(String[] args) {
        Scanner galpin = new Scanner(System.in); 

        System.out.print("Silahkan masukkan panjang sisi Persegi Sama Sisi: ");
        int inputPanjang = galpin.nextInt();
        
        for (int baris = 1; baris <= inputPanjang; baris++) {
            for (int kolom = 1; kolom <= inputPanjang; kolom++) {
                if (baris == 1 || baris == inputPanjang || kolom == 1 || kolom == inputPanjang) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
 