package Algoritma;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugas8Algoritma {
    public static void selectionSortDescending(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (list.get(j) > list.get(maxIndex)) {
                    maxIndex = j;
                }
            }

            int temp = list.get(maxIndex);
            list.set(maxIndex, list.get(i));
            list.set(i, temp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Masukkan elemen:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("ArrayList sebelum diurutkan:");
        System.out.println(list);

        selectionSortDescending(list);

        System.out.println("ArrayList setelah diurutkan secara descending:");
        System.out.println(list);
    }
}
