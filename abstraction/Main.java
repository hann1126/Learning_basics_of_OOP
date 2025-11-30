package belajaroop.abstraction;

public class Main {
    public static void main(String[] args) {
        Kendaraan[] daftar = {
            new Mobil("Honda"),
            new Motor("Yamaha")
        };

        for (Kendaraan k : daftar){
            k.info();
            k.jalan();
        }

    }
}
