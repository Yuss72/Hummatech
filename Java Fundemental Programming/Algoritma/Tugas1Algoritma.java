package Algoritma;

import java.util.Scanner;

public class Tugas1Algoritma {
     public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka (basis): ");
        int base = scanner.nextInt();

        System.out.print("Masukkan nilai pangkat: ");
        int exponent = scanner.nextInt();

        int result = power(base, exponent);
        System.out.println(base + " dipangkatkan " + exponent + " adalah " + result);
    }
}
