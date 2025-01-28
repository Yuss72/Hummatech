package OperatorString;

import java.util.Scanner;
public class Tugas9S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Silahkan Masukkan Kalimat Yang Akan Diubah Ke Dalam Array: ");
        String iKalimat = input.nextLine();

        String[] kata = iKalimat.split(" ");

        System.out.println("Jumlah Panjang Kata: " + kata.length);

        System.out.println("\n== Kalimat Yang Telah Dimasukkan ==");
        for(String text : kata) {
            System.out.print(text.toUpperCase() + " ");
        }
    }
}