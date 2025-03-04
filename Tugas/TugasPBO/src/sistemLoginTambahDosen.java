package loginSystem;

import java.util.Scanner;

class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}

class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public boolean login(String inputNama, String inputNim) {
        return nama.equals(inputNama) && nim.equals(inputNim);
    }

    public void printData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

class Dosen {
    private String nama;
    private String nidn;

    public Dosen(String nama, String nidn) {
        this.nama = nama;
        this.nidn = nidn;
    }

    public boolean login(String inputNama, String inputNip) {
        return nama.equals(inputNama) && nidn.equals(inputNip);
    }

    public void printData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIDN: " + nidn);
    }
}

public class sistemLoginTambahDosen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Dosen");
        System.out.print("Masukkan pilihan: ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            String username = sc.nextLine();
            System.out.print("Masukkan Password: ");
            String password = sc.nextLine();

            Admin admin = new Admin("Admin085", "Password085");
            if (admin.login(username, password)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa("Farah Fairuz Sadidah", "202410370110085");
            if (mahasiswa.login(nama, nim)) {
                System.out.println("Login Mahasiswa berhasil!");
                mahasiswa.printData();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else if (pilihan == 3) {
            System.out.print("Masukkan Nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIDN: ");
            String nidn = sc.nextLine();

            Dosen dosen = new Dosen("ASK", "0701038202");
            if (dosen.login(nama, nidn)) {
                System.out.println("Login Dosen berhasil!");
                dosen.printData();
            } else {
                System.out.println("Login gagal! Nama atau NIDN salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        sc.close();
    }
}
