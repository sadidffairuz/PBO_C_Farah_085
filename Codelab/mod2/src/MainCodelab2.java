import java.util.ArrayList;
import java.util.Scanner;

class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;
    String pin;
    ArrayList<String> riwayatTransaksi;
    int poinLoyalitas;

    RekeningBank(String nomorRekening, String namaPemilik, double saldo, String pin) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
        this.pin = pin;
        this.riwayatTransaksi = new ArrayList<>();
        this.poinLoyalitas = 0;
    }

    void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + this.nomorRekening);
        System.out.println("Nama Pemilik: " + this.namaPemilik);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Poin Loyalitas: " + this.poinLoyalitas + "\n");
    }

    void setorUang(double jumlah) {
        this.saldo += jumlah;
        this.poinLoyalitas += (int) jumlah / 100;
        String transaksi = "Setor: " + jumlah + ", Saldo: " + this.saldo + ", Poin Loyalitas: " + this.poinLoyalitas;
        riwayatTransaksi.add(transaksi);
        System.out.println(transaksi);
        kirimNotifikasi("Setoran sebesar " + jumlah + " berhasil.");
    }

    void tarikUang(double jumlah) {
        if (this.saldo >= jumlah) {
            this.saldo -= jumlah;
            String transaksi = "Tarik: " + jumlah + ", Saldo: " + this.saldo;
            riwayatTransaksi.add(transaksi);
            System.out.println(transaksi);
            kirimNotifikasi("Penarikan sebesar " + jumlah + " berhasil.");
        } else {
            System.out.println("Saldo tidak mencukupi untuk menarik " + jumlah);
        }
    }

    void transferUang(RekeningBank tujuan, double jumlah) {
        if (this.saldo >= jumlah) {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            String transaksi = "Transfer: " + jumlah + " ke " + tujuan.nomorRekening + ", Saldo: " + this.saldo;
            riwayatTransaksi.add(transaksi);
            String transaksiTujuan = "Transfer: " + jumlah + " dari " + this.nomorRekening + ", Saldo: " + tujuan.saldo;
            tujuan.riwayatTransaksi.add(transaksiTujuan);
            System.out.println(transaksi);
            kirimNotifikasi("Transfer sebesar " + jumlah + " ke rekening " + tujuan.nomorRekening + " berhasil.");
        } else {
            System.out.println("Saldo tidak mencukupi untuk transfer " + jumlah);
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

    void investasi(double jumlah, double bunga) {
        double hasilInvestasi = jumlah * (1 + bunga / 100);
        this.saldo += hasilInvestasi;
        String transaksi = "Investasi: " + jumlah + " dengan bunga " + bunga + "%, Hasil: " + hasilInvestasi + ", Saldo: " + this.saldo;
        riwayatTransaksi.add(transaksi);
        System.out.println(transaksi);
        kirimNotifikasi("Investasi sebesar " + jumlah + " dengan bunga " + bunga + "% berhasil.");
    }

    private void kirimNotifikasi(String pesan) {
        System.out.println("[Notifikasi Email] " + pesan + " dikirim ke " + this.namaPemilik + "@gmail.com");
    }
}

public class MainCodelab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RekeningBank rekening1 = new RekeningBank("202410370110085", "FarahFairuz", 500000.0, "1234");
        RekeningBank rekening2 = new RekeningBank("2020850220", "SayyidahDinary", 750000.0, "5678");

        while (true) {
            System.out.println("\nPilih opsi:");
            System.out.println("1. Tampilkan Informasi Rekening");
            System.out.println("2. Setor Uang");
            System.out.println("3. Tarik Uang");
            System.out.println("4. Transfer Uang");
            System.out.println("5. Cek Saldo");
            System.out.println("6. Tampilkan Riwayat Transaksi");
            System.out.println("7. Investasi");
            System.out.println("8. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 8) {
                break;
            }

            switch (pilihan) {
                case 1:
                    rekening1.tampilkanInfo();
                    rekening2.tampilkanInfo();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah setoran: ");
                    double jumlahSetor = scanner.nextDouble();
                    rekening1.setorUang(jumlahSetor);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah penarikan: ");
                    double jumlahTarik = scanner.nextDouble();
                    rekening1.tarikUang(jumlahTarik);
                    break;
                case 4:
                    System.out.print("Masukkan jumlah transfer: ");
                    double jumlahTransfer = scanner.nextDouble();
                    rekening1.transferUang(rekening2, jumlahTransfer);
                    break;
                case 5:
                    System.out.print("Masukkan PIN untuk cek saldo: ");
                    String pinMasukan = scanner.nextLine();
                    rekening1.cekSaldo(pinMasukan);
                    break;
                case 6:
                    rekening1.tampilkanRiwayatTransaksi();
                    rekening2.tampilkanRiwayatTransaksi();
                    break;
                case 7:
                    System.out.print("Masukkan jumlah investasi: ");
                    double jumlahInvestasi = scanner.nextDouble();
                    System.out.print("Masukkan bunga investasi (%): ");
                    double bungaInvestasi = scanner.nextDouble();
                    rekening1.investasi(jumlahInvestasi, bungaInvestasi);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

        scanner.close();
    }
}
