package belajaroop.interfacee.lat01;

public class MainPembayaran {
    public static void main(String[] args) {
        Pembayaran[] jenis = {
            new Dana(),
            new Ovo(),
            new Gopay()
        };

        for(Pembayaran k : jenis){
            k.prosesPembayaran(50000);
        }
    }
}
