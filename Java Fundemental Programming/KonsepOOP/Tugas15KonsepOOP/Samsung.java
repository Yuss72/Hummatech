package Tugas11.Tugas15KonsepOOP;

public class Samsung implements Control {
    private String[] channels = {"Channel 1", "Channel 2", "Channel 3", "Channel 4", "Channel 5"};
    private int volume = 10;

    @Override
    public void pindahChannel(int channelIndex) {
        if (channelIndex >= 0 && channelIndex < channels.length) {
            System.out.println("Samsung TV switched to " + channels[channelIndex]);
        } else {
            System.out.println("Invalid channel index for Samsung TV.");
        }
    }

    @Override
    public void volumeBesar() {
        if (volume < 30) {
            volume++;
            System.out.println("Samsung TV Volume: " + volume);
        } else {
            System.out.println("Samsung TV volume is at maximum.");
        }
    }

    @Override
    public void volumeKecil() {
        if (volume > 0) {
            volume--;
            System.out.println("Samsung TV Volume: " + volume);
        } else {
            System.out.println("Samsung TV volume is at minimum.");
        }
    }
}

