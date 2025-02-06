package Tugas11.Tugas14KonsepOOP;

public class Drone implements Signal, Communication {
    @Override
    public void sendSignal(String signal) {
        System.out.println("Drone sending signal: " + signal);
    }

    @Override
    public void receiveSignal() {
        System.out.println("Drone receiving signal.");
    }

    @Override
    public void startCommunication() {
        System.out.println("Drone starting communication.");
    }

    @Override
    public void stopCommunication() {
        System.out.println("Drone stopping communication.");
    }
}

