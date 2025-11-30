package belajaroop.inheritance;

public class Mamalia extends Hewan {
    int jumlahKaki;

    public Mamalia(String nama, int jumlahKaki) {
        super(nama);
        this.jumlahKaki = jumlahKaki;
    }

    public void info() {
        System.out.println(nama + " adalah mamalia dengan " + jumlahKaki + " kaki");
    }
}
