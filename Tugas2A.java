import java.util.Scanner;
public class Tugas2A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaSiswa[] = new String[5];
        for (int ulang = 0; ulang > 5; ulang++) {
            System.out.print("Masukkan 5 Nama Teman Anda: ");
            String nama = input.nextLine();
            namaSiswa[ulang] = nama;
        }
    }
}