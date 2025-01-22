import java.util.Scanner;

public class Tugas1L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         // Inputan biodata
        System.out.print("Masukkan nama lengkap Anda: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();

        input.nextLine();

        System.out.print("Masukkan kota asal Anda: ");
        String kotaAsal = input.nextLine();

        System.out.print("Masukkan tinggi badan Anda: ");
        double tinggiBadan = input.nextDouble();

        // Menampilkan output biodata
        System.out.println("\n=== Biodata Anda ===");
        System.out.println("Nama Lengkap\t: " + namaLengkap);
        System.out.println("Usia\t\t: " + usia);
        System.out.println("Kota Asal\t: " + kotaAsal);
        System.out.println("Tinggi Badan\t: " + tinggiBadan);
    }
}