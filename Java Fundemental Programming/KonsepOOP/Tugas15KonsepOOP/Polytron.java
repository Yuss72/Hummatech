package Tugas11.Tugas15KonsepOOP;

public class Polytron implements Control {
    private String[] channels = {"Channel A", "Channel B", "Channel C", "Channel D", "Channel E"};
    private int volume = 10;

    @Override
    public void pindahChannel(int channelIndex) {
        if (channelIndex >= 0 && channelIndex < channels.length) {
            System.out.println("Polytron TV switched to " + channels[channelIndex]);
        } else {
            System.out.println("Invalid channel index for Polytron TV.");
        }
    }

    @Override
    public void volumeBesar() {
        if (volume < 30) {
            volume++;
            System.out.println("Polytron TV Volume: " + volume);
        } else {
            System.out.println("Polytron TV volume is at maximum.");
        }
    }

    @Override
    public void volumeKecil() {
        if (volume > 0) {
            volume--;
            System.out.println("Polytron TV Volume: " + volume);
        } else {
            System.out.println("Polytron TV volume is at minimum.");
        }
    }
}
