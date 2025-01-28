package OperatorString;

public class Tugas8S {
    public static void main(String[] args) {
        String kalimat1 = "HUMMASOFT TECHNOLOGY MALANG";
        String kalimat2 = "kelas industri bergengsi di dunia";
        String kalimat3 = "hummasoft mempunyai produk sistem sekolah";

        System.out.println("\nKalimat Awal: " + "HUMMASOFT TECHNOLOGY MALANG");
        System.out.println("Merubah String ke Lower Case: " + kalimat1.toLowerCase());

        System.out.println("\nKalimat Awal: " + "kelas industri bergengsi di dunia");
        System.out.println("Merubah String ke Upper Case: " + kalimat2.toUpperCase());

        System.out.println("\nKalimat Awal: " + "hummasoft mempunyai produk sistem sekolah");
        System.out.println("Campuran: " + kalimat3.replace("hummasoft", "HUMMASOFT".toUpperCase()).replace("mempunyai produk", "mempunyai produk".toLowerCase()).replace("sistem sekolah", "SISTEM SEKOLAH".toUpperCase()));
    }
}
