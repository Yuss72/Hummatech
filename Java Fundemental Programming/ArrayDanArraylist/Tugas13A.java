/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 22 - Januari - 2025
 * Kode program : Matrix
*/

import java.util.Scanner;
public class Tugas13A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] mA = new int[3][2]; 
        int[][] mB = new int[3][2];
        int[][] hasil = new int[3][2];

        for (int k = 0; k < mA.length; k++) {
            for (int b = 0; b < mA[k].length; b++) {
                System.out.print("Silahkan Masukkan nilai matrixA " + (k + 1) + ": ");
                int imA = input.nextInt();
                mA[k][b] = imA;
            }
            System.out.println();
        }
        System.out.println();

        for (int k = 0; k < mB.length; k++) {
            for (int b = 0; b < mB[k].length; b++) {
                System.out.print("Silahkan Masukkan nilai matrixA " + (k + 1) + ": ");
                int imB = input.nextInt();
                mB[k][b] = imB;
            }
            System.out.println();
        }
        System.out.println();

        // Proses Menampilkan dan Menambanhkan Matrix
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