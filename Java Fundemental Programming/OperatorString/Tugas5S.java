package OperatorString;

import java.util.ArrayList;
import java.util.Scanner;
public class Tugas5S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Silahkan Masukkan Jumlah Data String Yang Akan Di Inputkan Ke Dalam Array: ");
        int iJData = input.nextInt();
        // flush
        input.nextLine();

        ArrayList<String> data = new ArrayList<>();

        System.out.println("\n=== Input Data ===");
        for (int u = 0; u < iJData; u++) {
            System.out.print("Data ke-" + (u + 1) + ": ");
            String iData = input.nextLine();
            data.add(iData);
        } 

        System.out.println("\n=== Output Data ===");
        for (int u = 0; u < iJData; u++) {
            System.out.print("Data ke-" + (u + 1) + ": ");

            if ((data.get(u)).length() > 0) {
                System.out.print((data.get(u)).trim());
            } else {
                System.out.print("-");
            }

            System.out.println();
        }
    }
}
