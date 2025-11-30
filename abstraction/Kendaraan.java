package belajaroop.abstraction;

public abstract class Kendaraan {
    String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void info() {
        System.out.println("Merk kendaraan: " + merk);
    }

    public abstract void jalan();
}
