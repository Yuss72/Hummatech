abstract class Binatang {
    public abstract void makan();
    public abstract void berkembangBiak();
    public abstract void hidupDi();
    public abstract void jenisHewan();
}

class Gajah extends Binatang {
    public void makan() {
        System.out.println("Gajah makan rumput dan dedaunan.");
    }

    public void berkembangBiak() {
        System.out.println("Gajah berkembang biak dengan melahirkan.");
    }

    public void hidupDi() {
        System.out.println("Gajah hidup di padang rumput dan hutan.");
    }

    public void jenisHewan() {
        System.out.println("Gajah adalah mamalia.");
    }
}

class Kelinci extends Binatang {
    public void makan() {
        System.out.println("Kelinci makan sayur dan rumput.");
    }

    public void berkembangBiak() {
        System.out.println("Kelinci berkembang biak dengan melahirkan.");
    }

    public void hidupDi() {
        System.out.println("Kelinci hidup di padang rumput dan hutan kecil.");
    }

    public void jenisHewan() {
        System.out.println("Kelinci adalah mamalia.");
    }
}

class Burung extends Binatang {
    public void makan() {
        System.out.println("Burung makan biji-bijian dan serangga.");
    }

    public void berkembangBiak() {
        System.out.println("Burung berkembang biak dengan bertelur.");
    }

    public void hidupDi() {
        System.out.println("Burung hidup di pohon dan udara.");
    }

    public void jenisHewan() {
        System.out.println("Burung adalah aves.");
    }
}

class Kucing extends Binatang {
    public void makan() {
        System.out.println("Kucing makan daging dan makanan kucing.");
    }

    public void berkembangBiak() {
        System.out.println("Kucing berkembang biak dengan melahirkan.");
    }

    public void hidupDi() {
        System.out.println("Kucing hidup di sekitar manusia.");
    }

    public void jenisHewan() {
    System.out.println("Kucing adalah mamalia.");
    }
}


public class Tugas9P {
    public static void main(String[] args) {
        Binatang[] binatang = {new Gajah(), new Kelinci(), new Burung(), new Kucing()};

        for (Binatang b : binatang) {
            System.out.println("===========");
            b.makan();
            b.berkembangBiak();
            b.hidupDi();
            b.jenisHewan();
            System.out.println("===========");
        }
    }
}