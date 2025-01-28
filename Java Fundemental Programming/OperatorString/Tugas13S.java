package OperatorString;

import java.util.ArrayList;
public class Tugas13S {
    public static void main(String[] args) {
        String kalimat = "hummasoft";

        ArrayList<Character> karakter = new ArrayList<>();

        for (int u = 0; u < kalimat.length(); u++) {
            System.out.print(kalimat.charAt(kalimat.length() - (u + 1)));
        } 
    }
}
