import java.util.Scanner;

public class Tugas1R {
    public static void main(String[] args) {
        Scanner segitiga = new Scanner(System.in);

        System.out.print("Masukkan nilai alas: ");
        int alas = segitiga.nextInt();

        System.out.print("Masukkan nilai tinggi: ");
        int tinggi = segitiga.nextInt();

        double luas = 0.5 * alas * tinggi;

        System.out.println("\n=== Output ===");
        System.out.println("Luas: " + luas);

        segitiga.close(); // mengclose Scanner
    }
}