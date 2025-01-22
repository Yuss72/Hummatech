import java.util.Scanner;

public class PerbandinganAngkaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah angka yang akan dibandingkan
        System.out.print("Masukkan jumlah angka yang ingin dibandingkan: ");
        int jumlah = scanner.nextInt();

        // Inisialisasi array untuk menyimpan angka
        int[] angka = new int[jumlah];

        // Meminta user untuk memasukkan angka-angka
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        // Menentukan angka terbesar dan terkecil
        int terbesar = angka[0];
        int terkecil = angka[0];

        for (int i = 1; i < jumlah; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
            if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }

        // Menampilkan hasil
        System.out.println("\nAngka yang Anda masukkan: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(angka[i] + " ");
        }

        System.out.println("\n\nAngka terbesar adalah: " + terbesar);
        System.out.println("Angka terkecil adalah: " + terkecil);

        // Menutup scanner
        scanner.close();
    }
}