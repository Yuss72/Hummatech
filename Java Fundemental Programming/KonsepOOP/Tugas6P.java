package KonsepOOP;

import java.util.Scanner;

class BentukDasar {
    private double luas;
    private double keliling;

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    public String getHasil() {
        return "Luas: " + luas + "\nKeliling: " + keliling;
    }
}

class PersegiPanjang extends BentukDasar {
    private double lebar;
    private double panjang;

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

    public double luas() {
        return (panjang * lebar);
    }

    public double keliling() {
        return (2 * (panjang + lebar));
    }
}

class Persegi extends BentukDasar {
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public double luas() {
        return (sisi * sisi);
    }

    public double keliling() {
        return (4 * sisi);
    }
}

class Segitiga extends BentukDasar {
    private double alas;
    private double tinggi;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double luas() {
        return (0.5 * alas * tinggi);
    }

    public double keliling() {
        double sisiMiring = Math.sqrt(alas + tinggi * tinggi);
        return (alas + tinggi + sisiMiring);
    }
}

class Lingkaran extends BentukDasar {
    private double r;
    private final double pi = 3.14;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double luas() {
        return (pi * r * r);
    }

    public double keliling() {
        return (2 * pi * r);
    }
}

public class Tugas6P {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PersegiPanjang pp = new PersegiPanjang();
        Persegi p = new Persegi();
        Segitiga s = new Segitiga();
        Lingkaran l = new Lingkaran();

        int iUser;
        boolean loop = false;

        do {
            System.out.print("""
                    Menu:
                    1. Persegi Panjang
                    2. Persegi
                    3. Segitiga
                    4. Lingkaran
                    5. Selesai

                    Silahkan Masukkan Input Anda: 
                    """);
            iUser = input.nextInt();
            System.out.println();

            switch(iUser) {
                case 1:
                System.out.print("Masukkan Panjang: ");
                pp.setPanjang(input.nextDouble());
                System.out.print("Masukkan Lebar: ");
                pp.setLebar(input.nextDouble());
                
                System.out.println("Luas: " + pp.luas());
                System.out.println("Keliling: " + pp.keliling());
                break;
                case 2:
                System.out.print("Masukkan Panjang Sisi: ");
                p.setSisi(input.nextDouble());

                System.out.println("Luas: " + p.luas());
                System.out.println("Keliling: " + p.keliling());
                break;
                case 3:
                System.out.print("Masukkan Alas: ");
                s.setAlas(input.nextDouble());
                System.out.print("Masukkan Tinggi: ");
                s.setTinggi(input.nextDouble());

                System.out.println("Luas: " + s.luas());
                System.out.println("Keliling: " + s.keliling());
                break;
                case 4:
                System.out.print("Masukkan Jari-Jari: ");
                l.setR(input.nextDouble());

                System.out.println("Luas: " + l.luas());
                System.out.println("Keliling: " + l.keliling());
                break;
                case 5:
                System.out.println("Program Berhenti!");
                loop = true;
                break;
                default:
                System.out.println("Input Tidak Valid!");
                break;
            }
        } while (iUser == 5);
    }
}