import java.util.Scanner;

public class belajar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan usia anda: ");
        int usia = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan kota asal anda: ");
        String kotaAsal = input.nextLine();

        System.out.print("Masukkan tinggi badan anda: ");
        double tinggiBadan = input.nextDouble();

        // output
        System.out.println("\nNama anda adalah: " + nama);
        System.out.println("Usia anda adalah: " + usia);
        System.out.println("Kota asal anda adalah: " + kotaAsal);
        System.out.println("Tinggi badan anda adalah: " + tinggiBadan);
    }
}
