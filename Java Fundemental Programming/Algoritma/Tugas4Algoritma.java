package Tugas12;

import java.util.Scanner;

public class Tugas4Algoritma {
      public static int generateNumber(int n) {
        if (n == 1) {
            return 3;
        }
        return generateNumber(n - 1) + (n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan dalam deret: ");
        int count = scanner.nextInt();

        if (count < 1) {
            System.out.println("Jumlah bilangan harus lebih dari 0.");
        } else {
            System.out.println("Deret angka:");
            for (int i = 1; i <= count; i++) {
                System.out.print(generateNumber(i) + " ");
            }
        }
    }
}
