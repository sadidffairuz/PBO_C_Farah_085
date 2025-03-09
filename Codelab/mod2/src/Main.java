class Hewann {
    String Nama;
    String Jenis;
    String Suara;
    int Umur;

    public Hewann(String Nama, String Jenis, String Suara, int Umur) {
        this.Nama = Nama;
        this.Jenis = Jenis;
        this.Suara = Suara;
        this.Umur = Umur;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis: " + Jenis);
        System.out.println("Suara: " + Suara);
        System.out.println("Umur: " + Umur + " tahun");
    }

    public void buatSuara() {
        System.out.println(Nama + " membuat suara: " + Suara);
    }

    public void tampilkanInfoTambahan() {
        System.out.println("Hewan ini adalah " + Jenis + " yang bernama " + Nama + ".");
        System.out.println("Umur " + Nama + " adalah " + Umur + " tahun dan membuat suara " + Suara + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewann hewan1 = new Hewann("Kucing", "Mamalia", "Nyann~~", 2);
        Hewann hewan2 = new Hewann("Anjing", "Mamalia", "Woof-Woof!!", 3);

        hewan1.tampilkanInfo();
        System.out.println();
        hewan2.tampilkanInfo();
        System.out.println();

        hewan1.buatSuara();
        hewan2.buatSuara();
        System.out.println();

        hewan1.tampilkanInfoTambahan();
        hewan2.tampilkanInfoTambahan();
    }
}
