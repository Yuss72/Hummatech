/* 
* Nama : Yusuf Usman
* Kelas : X RPL 1
* Tanggal : 05 - Desember - 2024
* Kode program : Array
*/

package ArrayDanArraylist;

public class Tugas8A {
    public static void main (String[] args) {
        String data[][] = {
            {"Sugito", "Prayoga"},
            {"Samirul", "Hilmi"},
            {"Leo", "Hermawan"},
            {"Triawan", "Angga"}
        };

        int no = 0;

        for (int b = 0; b < data.length; b++) {
            System.out.print((no + 1) + ". ");
            for (int k = 0; k < data[b].length; k++) {
                System.out.print(data[b][k] + " ");
            }
            System.out.println();
            no++;
        }
    }
}
