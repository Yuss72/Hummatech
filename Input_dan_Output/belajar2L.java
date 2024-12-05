import java.io.*;

public class belajar2L {
    public static void main(String[] args ) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nama anda: ");
        String nama = input.readLine();

        System.out.print("Masukkan usia anda: ");
        int usia = Integer.parseInt(input.readLine());

        System.out.print("Masukkan tinggi badan anda: ");
        double tinggiBadan = Double.parseDouble(input.readLine());

        System.out.print("Masukkan jenis kelamin anda: ");
        char kelamin = input.readLine().charAt(0);

        //outprut
        System.out.println("\nNama anda: " + nama);
        System.out.println("Usia anda: " + usia);
        System.out.println("Tinggi badan anda: " + tinggiBadan);
        System.out.println("Kelamin anda: " + kelamin);
    }
} 
