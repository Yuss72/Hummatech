/* Nama : Yusuf Usman
 * Kelas : X RPL - 1
 * Tanggal : 11 - Desember - 2024
 * Kode Program : Menghitung Rata Rata Nilai
 */

public class Ujian2 {
    public static void main(String[] args) {
        int[] nilai = {76, 65, 89, 90, 43};
        int total = 0;
        double rr = 0;

        for (int u = 0; u < nilai.length; u++) {
            total += nilai[u];
            rr = total / nilai.length;
        }

        // Output
        System.out.println("Nilai Dari 5 siswa SMK ABC : 76, 65, 89, 90, 43");
        System.out.println("Total : " + total);
        System.out.println("\nJadi Nilai Rata Rata Dari Siswa SMK ABC Adalah " + rr);
    }    
}
