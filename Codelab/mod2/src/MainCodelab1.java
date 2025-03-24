import java.util.Scanner;
import java.util.ArrayList;

class Hewan {
    String Nama;
    String Jenis;
    String Suara;

    Hewan(String Nama, String Jenis, String Suara) {
        this.Nama = Nama;
        this.Jenis = Jenis;
        this.Suara = Suara;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + this.Nama);
        System.out.println("Jenis: " + this.Jenis);
        System.out.println("Suara: " + this.Suara);
    }
}

public class MainCodelab1 {
    private static ArrayList<Hewan> daftarHewan = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program informasi hewan!");
        System.out.println("Masukkan informasi hewan:");

        while (true) {
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Jenis: ");
            String jenis = scanner.nextLine();

            System.out.print("Pilih suara:\n1. Nyann~~\n2. Woof-Woof!!\n3. Moooo\n4. Chirp-Chirp\n5. Roarrr\nPilihan: ");
            int pilihanSuara = scanner.nextInt();
            scanner.nextLine();

            String suara;
            switch (pilihanSuara) {
                case 1:
                    suara = "Meoww";
                    break;
                case 2:
                    suara = "Woof-Woof!!";
                    break;
                case 3:
                    suara = "Moooo";
                    break;
                case 4:
                    suara = "Chirp-Chirp";
                    break;
                case 5:
                    suara = "Aummm";
                    break;
                default:
                    suara = "Suara tidak dikenal";
                    break;
            }

            Hewan hewan = new Hewan(nama, jenis, suara);
            daftarHewan.add(hewan);

            System.out.print("Apakah Anda ingin menambahkan hewan lagi? (y/n): ");
            String pilihan = scanner.nextLine();
            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("\nInformasi hewan yang telah dibuat:");
        for (Hewan hewan : daftarHewan) {
            hewan.tampilkanInfo();
            System.out.println();
        }

        System.out.println("Jumlah hewan yang telah dibuat: " + daftarHewan.size());
    }
}
