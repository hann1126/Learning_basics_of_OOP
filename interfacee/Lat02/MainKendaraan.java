package belajaroop.interfacee.Lat02;

public class MainKendaraan {
    public static void main(String[] args) {
        Object[] daftar  = {
            new Mobil(),
            new Motor()
        };

        for (Object k : daftar){
            Mesin mesin = (Mesin) k;
            Kecepatan kecepatan = (Kecepatan) k;

            mesin.hidupkanMenisin();
            kecepatan.tambahKecepatan(40);
            kecepatan.kurangiKecepatan(20);
            mesin.matikanMesin();
        }
    }
}
