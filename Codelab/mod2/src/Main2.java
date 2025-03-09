/*import java.util.ArrayList;
import java.util.Scanner;

class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;
    String pin;
    ArrayList<String> riwayatTransaksi;

    RekeningBank(String nomorRekening, String namaPemilik, double saldo, String pin) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
        this.pin = pin;
        this.riwayatTransaksi = new ArrayList<>();
    }

    void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + this.nomorRekening);
        System.out.println("Nama Pemilik: " + this.namaPemilik);
        System.out.println("Saldo: " + this.saldo);
    }

    void setorUang(double jumlah) {
        this.saldo += jumlah;
        String transaksi = "Setor: " + jumlah + ", Saldo: " + this.saldo;
        riwayatTransaksi.add(transaksi);
        System.out.println(transaksi);
    }

    void tarikUang(double jumlah) {
        if (this.saldo >= jumlah) {
            this.saldo -= jumlah;
            String transaksi = "Tarik: " + jumlah + ", Saldo: " + this.saldo;
            riwayatTransaksi.add(transaksi);
            System.out.println(transaksi);
        } else {
            System.out.println("Saldo tidak mencukupi untuk menarik " + jumlah);
        }
    }

    void cekSaldo(String pinMasukan) {
        if (this.pin.equals(pinMasukan)) {
            System.out.println("Saldo Anda saat ini: " + this.saldo);
        } else {
            System.out.println("PIN salah. Tidak dapat menampilkan saldo.");
        }
    }

    void tampilkanRiwayatTransaksi() {
        System.out.println("Riwayat Transaksi untuk Rekening " + this.nomorRekening + ":");
        for (String transaksi : riwayatTransaksi) {
            System.out.println(transaksi);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RekeningBank rekening1 = new RekeningBank("202410370110085", "Farh Fairuz Sadidah", 5000000000.0, "1234");

        RekeningBank rekening2 = new ("2020850220", "Sayyidah Dinary", 1000000000.0, "5678");

        rekening1.tampilkanInfo();

        rekening1.setorUang(100000000);

        rekening1.tarikUang(50000);

        System.out.print("Masukkan PIN untuk cek saldo rekening1: ");
        String pinMasukan1 = scanner.nextLine();
        rekening1.cekSaldo(pinMasukan1);

        rekening1.tampilkanRiwayatTransaksi();

        System.out.println();

        rekening2.tampilkanInfo();

        rekening2.setorUang(50000000);

        rekening2.tarikUang(300000);

        System.out.print("Masukkan PIN untuk cek saldo rekening2: ");
        String pinMasukan2 = scanner.nextLine();
        rekening2.cekSaldo(pinMasukan2);

        rekening2.tampilkanRiwayatTransaksi();
    }
}
*/