package OperatorString;

import java.util.Scanner;
public class Tugas4S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = "";
        String email = "";
        String alamat = "";
        int u = 1;

        System.out.println("=== BIODATA ===");
        while (u > 0) {
            System.out.print("Masukkan Nama: ");
            nama = input.nextLine();

            if (nama.length() == 0) {
                System.out.println("Nama Tidak Boleh Kosong!\n");
            } else {
                break;
            }
        }

        while (u > 0) {
            System.out.print("Masukkan Alamat Anda: ");
            alamat = input.nextLine();

            if (alamat.length() == 0) {
                System.out.println("Alamat Tidak Boleh Kosong!\n");
            } else {
                break;
            }
        }

        while (u > 0) {
            System.out.print("Masukkan Email: ");
            email = input.nextLine();

            if (email.length() == 0) {
                System.out.println("Email Tidak Boleh Kosong!\n");
            } else {
                break;
            }
        }

        System.out.println("\n=== BIODATA === ");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Email: " + email);
    }
}
