package belajaroop.interfacee.lat01;

public class Dana implements Pembayaran {
    @Override
    public void prosesPembayaran(int jumlah){
        // jumlah = 5000;
        System.out.println("Dana: Pembyaran berhasil sebesar Rp."+jumlah);
    }
}
