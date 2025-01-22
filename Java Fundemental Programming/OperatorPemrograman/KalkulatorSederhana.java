import java.util.Scanner;
public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka Pertama: ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan angka Kedua: ");
        int nilai2 = input.nextInt();
        input.nextLine();

        int hasil;

        // Operator Pertambahan
        hasil = nilai1 + nilai2;
        System.out.println("Hasil Penjumlahan: " + hasil);

        // Operator Pengurangan
        hasil = nilai1 - nilai2;
        System.out.println("Hasil Pengurangan: " + hasil);

        // Operator Perkalian
        hasil = nilai1 * nilai2;
        System.out.println("Hasil Perkalian: " + hasil);

        // Operator Permbagian
        hasil = nilai1 / nilai2;
        System.out.println("Hasil Pembagian: " + hasil);

        // Operator Modulus
        hasil = nilai1 % nilai2;
        System.out.println("Hasil Modulus: " + hasil);
    }
}
