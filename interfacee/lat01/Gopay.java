package belajaroop.interfacee.lat01;

public class Gopay implements Pembayaran {
    @Override
    public void prosesPembayaran(int jumlah){
        // jumlah = 20000;
        System.out.println("Gopay: Pembayaran berhasil sejumlah Rp."+jumlah);
    }
}
