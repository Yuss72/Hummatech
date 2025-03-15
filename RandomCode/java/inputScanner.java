import java.util.Scanner;

public class inputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        System.out.print("Masukkan angka desimal: ");
        double desimal = input.nextDouble();

        System.out.println("\n==== Output ====");
        System.out.println("Nama: " + nama);
        System.out.println("Angka: " + angka);
        System.out.println("Desimal: " + desimal);
    }
}
