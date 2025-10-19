package belajaroop.inheritance;

public class Hewan {
    String nama;

    
    public Hewan(String nama){
        this.nama = nama;

    }

    public void makan() {
        System.out.println(nama + " sedang makan..");
    }

    public void bergerak() {
        System.out.println(nama + " sedang bergerak");
    }
}
