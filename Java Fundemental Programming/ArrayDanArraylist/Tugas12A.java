/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 20   - Desember - 2024
 * Kode program : Array
*/

public class Tugas12A {
    public static void main(String[] args) {
        int[][] mA = new int[2][2];
        int[][] mB = new int[2][2];
        int[][] hasil = new int[2][2];

        mA[0][0] = 4;
        mA[0][1] = 5;
        mA[1][0] = 3;
        mA[1][1] = 2;

        mB[0][0] = 6;
        mB[0][1] = 2;
        mB[1][0] = 8;
        mB[1][1] = 4;

        System.out.println("Matrix A");
        for (int k = 0; k < mA.length; k++) {
            for (int b = 0; b < mA[k].length; b++) {
                System.out.print(mA[k][b] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatrix B");
        for (int k = 0; k < mB.length; k++) {
            for (int b = 0; b < mB[k].length; b++) {
                System.out.print(mB[k][b] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nHasil Penjumlahan Matrix A + Matrix B");
        for (int k = 0; k < mB.length; k++) {
            for (int b = 0; b < mB[k].length; b++) {
                hasil[k][b] = mA[k][b] + mB[k][b];
                System.out.print(hasil[k][b] + "\t");
            }
            System.out.println();
        }
    }
}