package Tugas11.Tugas15KonsepOOP;

import java.util.Scanner;

public class TestRemote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RemoteControl remote = new RemoteControl();
        
        System.out.println("Pilih jenis TV:");
        System.out.println("1. Samsung");
        System.out.println("2. Polytron");
        int pilihanTV = scanner.nextInt();

        if (pilihanTV == 1) {
            remote.setControl(new Samsung());
        } else if (pilihanTV == 2) {
            remote.setControl(new Polytron());
        } else {
            System.out.println("TV tidak tersedia.");
            return;
        }

        while (true) {
            System.out.println("\nPilih aksi:");
            System.out.println("1. Pindah Channel");
            System.out.println("2. Perbesar Volume");
            System.out.println("3. Perkecil Volume");
            System.out.println("4. Keluar");
            int aksi = scanner.nextInt();

            switch (aksi) {
                case 1:
                    remote.pilihChannel();
                    break;
                case 2:
                    remote.perbesarVolume();
                    break;
                case 3:
                    remote.perkecilVolume();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

