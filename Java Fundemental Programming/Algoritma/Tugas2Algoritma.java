package Tugas12;

import java.util.Scanner;

public class Tugas2Algoritma {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka untuk dihitung faktorialnya: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Faktorial tidak dapat dihitung untuk angka negatif.");
        } else {
            long result = factorial(number);
            System.out.println("Faktorial dari " + number + " adalah " + result);
        }
    }
}
