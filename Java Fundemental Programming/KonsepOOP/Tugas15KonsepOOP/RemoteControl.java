package Tugas11.Tugas15KonsepOOP;

import java.util.Scanner;

public class RemoteControl {
    private Control control;
    private Scanner scanner = new Scanner(System.in);

    public void setControl(Control control) {
        this.control = control;
    }

    public void pilihChannel() {
        System.out.println("Pilih Channel (0-4): ");
        int channelIndex = scanner.nextInt();
        control.pindahChannel(channelIndex);
    }

    public void perbesarVolume() {
        control.volumeBesar();
    }

    public void perkecilVolume() {
        control.volumeKecil();
    }
}
