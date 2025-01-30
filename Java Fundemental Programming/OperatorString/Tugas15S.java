package OperatorString;

public class Tugas15S {
    public static void main(String[] args) {
        String kalimat = "HUMMASOFT TECHNOLOGY";

        String[] kata = kalimat.split(" ");
        String[] kecil = new String[kata.length];

        for (int u = 0; u < kata.length; u++) {
            kecil[u] = kata[u].substring(1).toLowerCase();
        }

        for (int u = 0; u < kata.length; u++) {
            System.out.print(kata[u].charAt(0) + kecil[u] + " ");
        }
    }
}
