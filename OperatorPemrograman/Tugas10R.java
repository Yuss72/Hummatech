public class Tugas10R {
    public static void main(String[] args) {
        boolean a = true; 
        boolean b = false; 

        System.out.println("a || a ? " + (a || a)); 
        System.out.println("a || b ? " + (a || b));
        System.out.println("b || a ? " + (b || a));
        System.out.println("b || b ? " + (b || b)); 
    }
}

/* 
Jika ada satu saja yang boolean nya true outputnya akan menjadi true
dan jika false semua yang keluar juga akan false
*/  
