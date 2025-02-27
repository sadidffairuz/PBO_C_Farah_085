package codelabMod1;

import java.util.Scanner;
import java.time.LocalDate;

class DataDiri {
    private String nama;
    private String jenisKelamin;
    private int umur;

    public DataDiri(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public void printData() {
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur : " + umur + " tahun");
    }
}

public class codelabMod1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Jenis Kelamin (P/L) : ");
        char pilihJenisKelamin = input.next().charAt(0);

        System.out.print("Masukkan tahun Lahir : ");
        int tahunLahir = input.nextInt();

        input.close();

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        String jenisKelamin;
        if (pilihJenisKelamin == 'L' || pilihJenisKelamin == 'l') {
            jenisKelamin = "Laki-laki";
        } else if (pilihJenisKelamin == 'P' || pilihJenisKelamin == 'p') {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Tidak Diketahui";
        }

        DataDiri dataDiri = new DataDiri(nama, jenisKelamin, umur);
        dataDiri.printData();
    }
}
