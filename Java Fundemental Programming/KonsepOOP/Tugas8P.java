import java.util.Scanner;

class Pasien {
    private String nomorKTP;
    private String namaPasien;
    private String namaDokter;

    public Pasien(String nomorKTP, String namaPasien, String namaDokter) {
        this.nomorKTP = nomorKTP;
        this.namaPasien = namaPasien;
        this.namaDokter = namaDokter;
    }

    public String getNomorKTP() { return nomorKTP; }
    public void setNomorKTP(String nomorKTP) { this.nomorKTP = nomorKTP; }
    
    public String getNamaPasien() { return namaPasien; }
    public void setNamaPasien(String namaPasien) { this.namaPasien = namaPasien; }
    
    public String getNamaDokter() { return namaDokter; }
    public void setNamaDokter(String namaDokter) { this.namaDokter = namaDokter; }
}

public class Tugas8P {
    private static Pasien[] pasienList = new Pasien[100];
    private static int jumlahPasien = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        
        do {
            System.out.println("\nMenu Pendataan Pasien:");
            System.out.println("1. Input Pasien");
            System.out.println("2. Update Pasien");
            System.out.println("3. View Pasien");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch(pilihan) {
                case 1:
                    inputPasien();
                    break;
                case 2:
                    updatePasien();
                    break;
                case 3:
                    viewPasien();
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(pilihan != 4);
    }

    private static void inputPasien() {
        if(jumlahPasien >= pasienList.length) {
            System.out.println("Database penuh! Tidak bisa menambah data baru.");
            return;
        }

        System.out.print("Masukkan Nomor KTP: ");
        String ktp = scanner.nextLine();
        System.out.print("Masukkan Nama Pasien: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Nama Dokter: ");
        String dokter = scanner.nextLine();

        pasienList[jumlahPasien] = new Pasien(ktp, nama, dokter);
        jumlahPasien++;
        System.out.println("Data pasien berhasil ditambahkan!");
    }

    private static void updatePasien() {
        System.out.print("Masukkan Nomor KTP yang akan diupdate: ");
        String searchKTP = scanner.nextLine();
        
        for(int i = 0; i < jumlahPasien; i++) {
            if(pasienList[i].getNomorKTP().equalsIgnoreCase(searchKTP)) {
                System.out.println("\nData ditemukan:");
                System.out.println("Nama Pasien: " + pasienList[i].getNamaPasien());
                System.out.println("Dokter: " + pasienList[i].getNamaDokter());
                
                System.out.print("\nMasukkan Nama Pasien baru: ");
                pasienList[i].setNamaPasien(scanner.nextLine());
                System.out.print("Masukkan Nama Dokter baru: ");
                pasienList[i].setNamaDokter(scanner.nextLine());
                
                System.out.println("Data berhasil diupdate!");
                return;
            }
        }
        System.out.println("Data dengan KTP " + searchKTP + " tidak ditemukan!");
    }

    private static void viewPasien() {
        if(jumlahPasien == 0) {
            System.out.println("Belum ada data pasien!");
            return;
        }

        System.out.println("\nDaftar Pasien:");
        System.out.println("==============================================");
        System.out.printf("| %-15s | %-20s | %-15s |\n", "No. KTP", "Nama Pasien", "Dokter");
        System.out.println("==============================================");
        
        for(int i = 0; i < jumlahPasien; i++) {
            System.out.printf("| %-15s | %-20s | %-15s |\n", 
                pasienList[i].getNomorKTP(), 
                pasienList[i].getNamaPasien(), 
                pasienList[i].getNamaDokter());
        }
        System.out.println("==============================================");
    }
}