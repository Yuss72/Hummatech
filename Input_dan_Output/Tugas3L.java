import java.io.Console;

public class Tugas3L {
    public static void main(String[] args) {
        Console input = System.console();

        // Input
        System.out.print("Jenis Kelamin: ");
        String kelamin = input.readLine();

        System.out.print("Nomor Sepatu: ");
        int nomorSepatu = Integer.parseInt(input.readLine());

        System.out.print("Sudah Menikah?: ");
        boolean sudahMenikah = Boolean.parseBoolean(input.readLine());

        //Output
        System.out.println("\n==== Output ====");
        System.out.println("Jenis Kelamin\t: " + kelamin);
        System.out.println("Nomor Sepatu\t: " + nomorSepatu);
        System.out.println("Sudah Menikah\t: " + sudahMenikah);
    } 
}
