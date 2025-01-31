package KonsepOOP;

import java.util.Scanner;

class BangunRuang {
    private double volume;

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double volume() {
        return (panjang * lebar * tinggi);
    }
}

class Kubus extends BangunRuang {
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public double volume() {
        return (3 * sisi);
    }
}

class Tabung extends BangunRuang {
    private double r;
    private double tinggi;
    private final double pi = 3.14;
    -
    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setTinggi(double tinggi) [
        this.tinggi = tinggi;
    ]

    public double getTinggi() {
        return tinggi;
    }

    public double volume() {
        return (pi * r * r * tinggi);
    }
}

class Kerucut extends BangunRuang {
    private double r;
    private double tinggi;

    // Setter & Getter
    public double getRadius() { 
        return r; 
        }

    public void setRadius(double radius) { 
        this.radius = r; 
        }
    
    public double getTinggi() { return tinggi; }
    public void setTinggi(double tinggi) { 
        this.tinggi = tinggi; 
        }

    @Override
    public double hitungVolume() {
        return (1.0/3) * Math.PI * Math.pow(r, 2) * tinggi;
    }
}

public class Tugas7P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Bangun Ruang:");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.println("5. Selesai");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch(pilihan) {
                case 1:
                    Balok balok = new Balok();
                    System.out.print("Masukkan panjang: ");
                    balok.setPanjang(scanner.nextDouble());
                    System.out.print("Masukkan lebar: ");
                    balok.setLebar(scanner.nextDouble());
                    System.out.print("Masukkan tinggi: ");
                    balok.setTinggi(scanner.nextDouble());
                    System.out.println("Volume Balok: " + balok.hitungVolume());
                    break;
                    
                case 2:
                    Kubus kubus = new Kubus();
                    System.out.print("Masukkan sisi: ");
                    kubus.setSisi(scanner.nextDouble());
                    System.out.println("Volume Kubus: " + kubus.hitungVolume());
                    break;
                    
                case 3:
                    Tabung tabung = new Tabung();
                    System.out.print("Masukkan radius: ");
                    tabung.setRadius(scanner.nextDouble());
                    System.out.print("Masukkan tinggi: ");
                    tabung.setTinggi(scanner.nextDouble());
                    System.out.println("Volume Tabung: " + tabung.hitungVolume());
                    break;
                    
                case 4:
                    Kerucut kerucut = new Kerucut();
                    System.out.print("Masukkan radius: ");
                    kerucut.setRadius(scanner.nextDouble());
                    System.out.print("Masukkan tinggi: ");
                    kerucut.setTinggi(scanner.nextDouble());
                    System.out.println("Volume Kerucut: " + kerucut.hitungVolume());
                    break;
                    
                case 5:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(pilihan != 5);

        scanner.close();
    }
}