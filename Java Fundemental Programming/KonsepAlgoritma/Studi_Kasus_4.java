public class Studi_Kasus_4 {
    public static void main(String[] args) {
        double belanja = 200000;
        double diskon = 0;
        double bayar = 0;

        if (belanja >= 100000 && belanja <= 300000) {
            diskon = 10.0 / 100 * belanja;
            bayar = belanja - diskon;
        }
        else if (belanja > 300000 && belanja <= 500000) {
            diskon = 20.0 / 100 * belanja;
            bayar = belanja - diskon;
        }
        else if (belanja > 500000) {
            diskon = 25.0 / 100 * belanja;
            bayar = belanja - diskon;
        }
        else {
            diskon = 0;
            bayar = belanja;
        }
        
        System.out.println("Total belanja: " + belanja);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + bayar);
    }
}

