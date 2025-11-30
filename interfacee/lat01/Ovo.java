package belajaroop.interfacee.lat01;

public class Ovo implements Pembayaran {
    @Override
    public void prosesPembayaran(int jumlah){
        // jumlah = 50000;
        System.out.println("Ovo: Pembayaran berhasil sebesar Rp."+jumlah);
    }
    
}
