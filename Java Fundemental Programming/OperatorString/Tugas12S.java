package OperatorString;

public class Tugas12S {
    public static void main(String[] args) {
        String kalimat = "saya belajar pemrograman java bersama hummatech di kelas industri";

        int total = 0;
        String[] kata = kalimat.split(" ");

        for (int u = 0; u < kata.length; u++) {
            
            total += kata[u].length();
        }

        System.out.println("Kalimat Yang Akan Dihitung Jumlah kata Dan karakternya: \n" + kalimat);
        System.out.println("\nJumlah Kata Pada Kalimat Tersebut: " + (kata.length - 1));
        System.out.println("Jumlah Karakter: " + total);
    }
}
