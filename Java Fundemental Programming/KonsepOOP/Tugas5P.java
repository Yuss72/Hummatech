package KonsepOOP;

import javax.swing.JOptionPane;

class KuraKura {
    private int kesehatan;
    private int kekuatan;
    private int pengalaman;

    public KuraKura(int kesehatan, int kekuatan, int pengalaman) {
        this.kesehatan = kesehatan;
        this.kekuatan = kekuatan;
        this.pengalaman = pengalaman;
    }

    public void Makan() {
        kesehatan += 2;
        kekuatan += 3;
        JOptionPane.showMessageDialog(null, "Kura-kura Telah Makan\nKesehatan +2\nkekuatan+3");
    }

    public void Berjalan() {
        kesehatan -= 1;
        kekuatan -= 1;
        pengalaman += 2;
        JOptionPane.showMessageDialog(null, "Kura-Kura Telah Berjalan!\nKesehatan -1\nKekuatan -1\nPengalaman +2");
    }

    public void Bertarung() {
        kesehatan -= 2;
        kekuatan -= 3;
        pengalaman -= 3;
        JOptionPane.showMessageDialog(null, "Kura-Kura Telah Bertarung!\nKesehatan -2\nKekuatan -3\nPengalaman -3");
    }

    public void Minum() {
        kesehatan += 1;
        kekuatan += 1;
        JOptionPane.showMessageDialog(null, "Kura-Kura Telah Minum!\nKesehatan +1\nKekuatan +1");
    }

    public String getStatus() {
        return "Status Kura-Kura:\n" + "Kesehatan " + kesehatan + "\nKekuatan " + kekuatan + "\nPengalaman" + pengalaman;
    }
}

public class Tugas5P {
    public static void main(String[] args) {
        KuraKura kura = new KuraKura(0, 0, 0);
        boolean jalan = true;

        while (jalan) {
            String input = JOptionPane.showInputDialog ("""
                Pilihan Tindakan: 
                1. Makan
                2. Berjalan
                3. Bertarung
                4. Minum
                5. Lihat Status
                6. Keluar
                    """);

            if (input.length() == 0) {
                break;
            }

            int pilihan = Integer.parseInt(input);

            switch(pilihan) {
                case 1:
                kura.Makan();
                break;
                case 2:
                kura.Berjalan();
                break;
                case 3:
                kura.Bertarung();
                break;
                case 4:
                kura.Minum();
                break;
                case 5:
                JOptionPane.showMessageDialog(null, kura.getStatus());
                break;
                case 6:
                JOptionPane.showMessageDialog(null, "System Telah Berhenti!");
                jalan = false;
                break;
                default:
                JOptionPane.showMessageDialog(null, "Input Tidak Valid!");
            }
        }
    }
}
