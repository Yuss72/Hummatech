/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 16 - Oktober - 2024
 * Kode program : Pengulangan
 */

package Perulangan;
import java.util.Scanner;
public class Tugas9O {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai faktorial yang diinginkan: ");
        int inputUser = input.nextInt();
        
        int faktorial = 1;
        int nilai = inputUser;
        while(nilai >= 1) {
            faktorial *= nilai;
            nilai--;
        }

        System.out.println(inputUser + "! = " + faktorial);
    }    
}