package belajaroop.polymorphism;

public class Karyawan {
    String nama;
    int gaji;

    public Karyawan(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void info() {
        System.out.println(nama + ", jumlah gaji:" + gaji);
    }

}
