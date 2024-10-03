public class Tugas4R {

    public static void main(String[] args) {
        double total = 0;
        total += 80;
        total += 95;
        total += 75;

        double rata_rata = total;
        rata_rata /= 3;

        System.out.println("\n=== Output ===");
        System.out.println("Total nilai dari 3 siswa: " + total);
        System.out.println("Rata rata dari nilai 3 siswa tersebut: " + rata_rata);
    }
}