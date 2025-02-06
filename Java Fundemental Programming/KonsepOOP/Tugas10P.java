import javax.swing.JOptionPane;

class Sekolah {
    protected String name;
    
    public Sekolah() {
    }
    
    public void info() {
        JOptionPane.showMessageDialog(null, "Nama: " + name);
    }
}

class Guru extends Sekolah {
    private int nip;
    private String nippi;
    
    public Guru() {
        super();
    }
    
    public void inputDataGuru() {
        nip = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIP:"));
        name = JOptionPane.showInputDialog("Masukkan Nama Guru:");
        nippi = JOptionPane.showInputDialog("Masukkan NIPPI:");
    }
    
    public void info() {
        JOptionPane.showMessageDialog(null, 
            "== Data Guru ==\n" +
            "NIP: " + nip + "\n" +
            "Nama: " + name + "\n" +
            "NIPPI: " + nippi);
    }
}

class Siswa extends Sekolah {
    private int nib;
    private int uts;
    private int uas;
    private double nilaiAkhir;
    
    public Siswa() {
        super();
    }
    
    public void inputDataSiswa() {
        nib = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIB:"));
        name = JOptionPane.showInputDialog("Masukkan Nama Siswa:");
        uts = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai UTS:"));
        uas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai UAS:"));
        nilaiAkhir = (uts + uas) / 2.0;
    }
    
    private String getGrade() {
        if(nilaiAkhir >= 85) return "A";
        else if(nilaiAkhir >= 70) return "B";
        else if(nilaiAkhir >= 55) return "C";
        else return "D";
    }
    
    public void info() {
        JOptionPane.showMessageDialog(null, 
            "== Data Siswa ==\n" +
            "NIB: " + nib + "\n" +
            "Nama: " + name + "\n" +
            "UTS: " + uts + "\n" +
            "UAS: " + uas + "\n" +
            "Nilai Akhir: " + String.format("%.2f", nilaiAkhir) + "\n" +
            "Grade: " + getGrade());
    }
}

public class Tugas10P {
    public static void main(String[] args) {
        Sekolah[] data = new Sekolah[2];
        
        Guru g = new Guru();
        g.inputDataGuru();
        data[0] = g;
        
        Siswa s = new Siswa();
        s.inputDataSiswa();
        data[1] = s;
        
        for(Sekolah obj : data) {
            obj.info();
        }
    }
}