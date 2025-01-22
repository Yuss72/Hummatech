package Perulangan;

import java.util.Scanner;

public class Tugas1O {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Angka yang diinginkan");
        int inputAngka = input.nextInt();
        int ulang = 0;

        int angka = inputAngka + 3;
        while (ulang < 10) {
            if (angka % 2 != 0) {
                System.out.println(angka);
                ulang++;
            }
            angka++;
        }
        input.close();
    }
}
