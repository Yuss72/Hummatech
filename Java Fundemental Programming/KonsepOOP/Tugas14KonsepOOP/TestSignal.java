package Tugas11.Tugas14KonsepOOP;

public class TestSignal {
    public static void main(String[] args) {
        Signal raspberryPiSignal = new RaspberryPi();
        Signal droneSignal = new Drone();
        
        Communication raspberryPiComm = new RaspberryPi();
        Communication droneComm = new Drone();
        
        System.out.println("Testing RaspberryPi:");
        raspberryPiSignal.sendSignal("Data to Drone");
        raspberryPiSignal.receiveSignal();
        raspberryPiComm.startCommunication();
        raspberryPiComm.stopCommunication();
        
        System.out.println("\n--------------------------\n");

        System.out.println("Testing Drone:");
        droneSignal.sendSignal("Data to RaspberryPi");
        droneSignal.receiveSignal();
        droneComm.startCommunication();
        droneComm.stopCommunication();
    }
}

