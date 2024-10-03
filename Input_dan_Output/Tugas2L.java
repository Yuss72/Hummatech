import java.io.*;

public class Tugas2L {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Input
        System.out.print("Nama Sekolah: ");
        String sekolah = input.readLine();

        System.out.print("Jarak Rumah ke Sekolah: ");
        double jarak = Double.parseDouble(input.readLine());

        System.out.print("Kode Plat Nomor: ");
        char kodePlat = input.readLine().charAt(0);

        System.out.print("Anak Ke Berapa: ");
        int anakKe = Integer.parseInt(input.readLine());

        // Output
        System.out.println("\n==== Output ====");
        System.out.println("Nama Sekolah: " + sekolah);
        System.out.println("Jarak Rumah ke Sekolah: " + jarak + " km");
        System.out.println("Kode Plat Nomor: " + kodePlat);
        System.out.println("Anak Ke: " + anakKe);
    } 
}
