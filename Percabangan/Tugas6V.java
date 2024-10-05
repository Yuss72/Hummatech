/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 4 - September - 2024
 * Kode program : Percabangan switch case
 */

package Percabangan;

import java.util.Scanner;

public class Tugas6V {
    public static void main(String[] ars) {
        Scanner input = new Scanner(System.in);
        char kodePlat;

        System.out.println("Masukkan kode plat nomor yang ada di JaTim: ");
        kodePlat = input.next().charAt(0);

        switch(kodePlat) {
            case 'L':
            System.out.println("Surabaya");
            break;
            case 'M':
            System.out.println("Bangkalan, Pamekasan, Sampang, dan Sumenep");
            break;
            case 'N':
            System.out.println("Batu, Lumajang, Malang, Pasuruan, dan Probolinggo");
            break;
            case 'S':
            System.out.println("Bojonegoro, Jombang, Lamongan, Mojokerto, dan Tuban");
            break;
            case 'W':
            System.out.println("Gresik dan Sidoarjo");
            break;
            case 'P':
            System.out.println("Banyuwangi, Bondowoso, Jember, dan Situbondo");
            break;
            default:
            System.out.println("Nomor plat yang anda masukkan tidak ada atau ada di luar JaTim.");
        }
    }   
}

/*
 * Kode plat AE dan AG tidak saya masukkan karena kodenya
 * selalu menampilkan error, dan saya kurang tau cara
 * mengatasinya.
 */
