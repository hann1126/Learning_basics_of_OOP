package belajaroop;

public class AkunBank {

    private String namaPemilik;
    private double saldo;

    public AkunBank(String namaPemilik, double saldoAwal) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
        } else {
            System.out.println("Saldo tidak boleh negatif!");
        }
    }

    public void setor(double jumlah) {
        if ( jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil setor ke " + namaPemilik + "sejumlah" + jumlah);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Berhasil tarik dari " + namaPemilik + " sebesar " + jumlah);
        } else {
            System.out.println("Penarikan gagal! Saldo tidak cukup atau jumlah tidak valid");
        }
    }

    public void transfer(AkunBank tujuan,double jumlah) {

        if (jumlah <= 0 ) {
            System.out.println("Jumlah trasfer harus lebih dari 0! ");
            return;
        } else if (jumlah > saldo) {
            System.out.println("Saldo tak mencukupi");
            return;
        }

        if (this == tujuan) {
            System.out.println("Tidak bisa transfer ke akun sendiri!");
            return;
        }
            saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Trasfer berhasil sebesr "+ jumlah+ " ke "+ tujuan.namaPemilik );
            System.out.println(tujuan.namaPemilik + " menerima transfer sebesar "+ jumlah + " dari " + this.namaPemilik);
        
    }

    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank("Asep",500000);
        AkunBank akun2 = new AkunBank("Ujang",500000);

        System.out.println("================");

        System.out.println("Nama pemilik: "+ akun1.getNamaPemilik());
        System.out.println("Saldo Awal: "+ akun1.getSaldo());

        System.out.println("================");

        System.out.println("Nama pemilik: "+ akun2.getNamaPemilik());
        System.out.println("Saldo Awal: "+ akun2.getSaldo());

        System.out.println("================");

        akun1.setor(300000);
        System.out.println("Saldo Sekarang: " + akun1.getSaldo());

        System.out.println("================");

        akun1.tarik(500000);
        System.out.println("Saldo Sekarang: " + akun1.getSaldo());

        System.out.println("================");

        akun1.transfer(akun2,200000);

        System.out.println("================");

        System.out.println("Saldo " + akun1.getNamaPemilik() + " adalah " + akun1.getSaldo());
        
        System.out.println("Saldo " + akun2.getNamaPemilik() + " adalah " + akun2.getSaldo());





    }
    
}
