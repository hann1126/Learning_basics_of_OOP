package belajaroop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Karyawan[] daftar = { new Manager("Asep", 2000000, 500000),
                new Porgrammer("Andi", 1500000, 300000) };

        for (Karyawan k : daftar) {
            k.info();
        }

    }
}
