package OperatorString;

public class Tugas14S {
    public static void main(String[] args) {
        String kalimat = "Aksara Jawa Hanacaraka Padajayanya";

        String[] kata = kalimat.split(" ");

        for (int u = 0; u < kata.length; u++) {
            kata[u] = kata[u].replace('A', 'O').replace('a', 'o');
        }
        
        for (String text : kata) {
            System.out.print(text + " ");
        }
    }
}
