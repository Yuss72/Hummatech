package Tugas12;

public class Tugas5Algoritma {
    public static void selectionSortRightToLeft(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            int minIndex = i;

            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {27, 80, 8, 46, 16, 12, 50};

        System.out.println("Array sebelum diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSortRightToLeft(arr);

        System.out.println("\nArray setelah diurutkan secara ascending:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
