package Tugas12;

import java.util.Scanner;

public class Tugas3Algoritma {
     public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan Fibonacci yang ingin ditampilkan: ");
        int count = scanner.nextInt();

        if (count < 1) {
            System.out.println("Jumlah bilangan harus lebih dari 0.");
        } else {
            System.out.println("Deret Fibonacci:");
            for (int i = 0; i < count; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }
}
