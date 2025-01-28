package OperatorString;

import java.util.Scanner;
import java.util.ArrayList;
public class Tugas7S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String binatang = "binatang";
        String pohon = "pohon";
        String tumbuhan = "tumbuhan";

        System.out.print("Silahkan Masukkan jumlah Kalimat Yang Akan Diinputkan: ");
        int jKalimat = input.nextInt();
        // flush
        input.nextLine();

        ArrayList<String> aKalimat = new ArrayList<>();

        System.out.println("\n=== Input ===");
        for (int u = 0; u < jKalimat; u++) {
            System.out.print("Silahkan Masukkan Kalimat: ");
            String iKalimat = input.nextLine();
            aKalimat.add(iKalimat);
        }

        System.out.println("\n=== Output ===");
        for (int u = 0; u < jKalimat; u++) {
            System.out.println("Kalimat ke " + (u + 1) + ": " + (((aKalimat.get(u)).replace("hewan", binatang)).replace("tanaman", tumbuhan)).replace("tangkai", pohon));
        }
    }
}
