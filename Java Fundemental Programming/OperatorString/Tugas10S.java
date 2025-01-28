package OperatorString;

public class Tugas10S {
    public static void main(String[] args) {
        String kalimat1 = "saya memancing ikan di sungai menggunakan pancingan yang panjang bersama teman saya yang berasal dari malang";

        String[] kata = kalimat1.split(" ");

        String[] kataKunci = {"memancing", "sungai", "teman", "malang"};
        String[] pengganti = {"menjaring", "laut", "saudara", "surabaya"};

        for (int u = 0; u < kata.length; u++) {
            for (int ul = 0; ul < kataKunci.length; ul++) {
                if (kata[u].equals(kataKunci[ul])) {
                    kata[u] = pengganti[ul];
                }
            }
        }

        for (String text : kata) {
            System.out.print(text + " ");
        }
    }
}
