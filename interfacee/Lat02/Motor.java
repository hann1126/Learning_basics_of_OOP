package belajaroop.interfacee.Lat02;

public class Motor implements Mesin, Kecepatan {
    String nama = "Honda";
    int kecepatan = 40;
    int total;

    @Override
    
    public void hidupkanMenisin(){
        System.out.println(nama+" Menyalakan mesin");
    }

    public void matikanMesin(){
        System.out.println(nama+ " Mematikan mesin");
    }

    public void tambahKecepatan(int km){
        total = kecepatan + km;
        System.out.println(nama+ " Menambah kecepatan sebesar "+ km+ " menjadi "+total);
    }

    public void kurangiKecepatan(int km){
        total = total-km;
        System.out.println(nama+ "Mengurangi kecepatan sebesar "+ km+ " menjadi "+total);
    }
}
