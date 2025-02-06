package Tugas11.Tugas14KonsepOOP;

public class RaspberryPi implements Signal, Communication {
    @Override
    public void sendSignal(String signal) {
        System.out.println("RaspberryPi sending signal: " + signal);
    }

    @Override
    public void receiveSignal() {
        System.out.println("RaspberryPi receiving signal.");
    }

    @Override
    public void startCommunication() {
        System.out.println("RaspberryPi starting communication.");
    }

    @Override
    public void stopCommunication() {
        System.out.println("RaspberryPi stopping communication.");
    }
}

