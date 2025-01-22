/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 05 - Desember - 2024
 * Kode program : Array
 */


public class Tugas7A {
    public static void main(String[] args) {
        String data[][] = {
            {"Xiaomi", "Poco M3", "1850000"},
            {"Oppo", "Reno 6", "4299000"},
            {"Vivo", "Y2", "1635000"},
            {"Oppo", "A15", "1618500"},
            {"Samsung", "Galaxy A12", "1990000"}
        };

        System.out.println("No  Merk\t\tTipe\t\tHarga");
        int no = 0;

        for (int b = 0; b < data.length; b++) {
            System.out.print((no + 1) + "   ");
            for (int k = 0; k < data[b].length; k++) {
                System.out.print(data[b][k] + "\t\t");
            }
            System.out.println();
            no++;
        }
    }
}