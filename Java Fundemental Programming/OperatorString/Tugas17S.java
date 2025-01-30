package OperatorString;

import java.util.Scanner;

public class Tugas17S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Silahkan Masukkan Nama Depan: ");
        String namaD = input.nextLine();

        System.out.println("Silahkan Masukkan Nama Belakang: ");
        String namaB = input.nextLine();

        String namaL = namaD + " " + namaB;

        System.out.println("Masukkan Alamat Lengkap Anda: ");
        String alamat = input.nextLine();

        System.out.println("=== Output ===");
        System.out.println("Alamat " + namaL + " di " + alamat);

        System.out.print("Nama dengan huruf bergantian: ");
        for (int ul = 0; ul < namaL.length(); ul++) {
            char karakter = namaL.charAt(ul);
            if (ul % 2 == 0) {
                System.out.print(Character.toUpperCase(karakter));
            } else {
                System.out.print(Character.toLowerCase(karakter));
            }
        }

        System.out.println();

        System.out.print("Alamat dengan huruf bergantian: ");
        for (int ul = 0; ul < alamat.length(); ul++) {
            char karakter = alamat.charAt(ul);
            if (ul % 2 == 0) {
                System.out.print(Character.toUpperCase(karakter));
            } else {
                System.out.print(Character.toLowerCase(karakter));
            }
        }

        input.close();
    }
}