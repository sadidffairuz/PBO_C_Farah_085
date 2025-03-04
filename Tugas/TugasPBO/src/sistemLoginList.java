package SistemLogin;

import java.util.ArrayList;
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

    public boolean login(String inputNama, String inputNidn) {
        return nama.equals(inputNama) && nidn.equals(inputNidn);
    }

    public void printData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nidn);
    }
}

public class sistemLoginList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Admin> adminList = new ArrayList<>();
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        ArrayList<Dosen> dosenList = new ArrayList<>();

        adminList.add(new Admin("Admin085", "Password085"));
        adminList.add(new Admin("Admin123", "Password123"));
        mahasiswaList.add(new Mahasiswa("Farah Fairuz Sadidah", "202410370110085"));
        mahasiswaList.add(new Mahasiswa("Ali Mustafa", "202410370110086"));
        dosenList.add(new Dosen("Dr. Budi Santoso", "1980101012345678"));
        dosenList.add(new Dosen("Dr. Ratna Dewi", "1979010112345678"));

        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Dosen");
        System.out.print("Masukkan pilihan: ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        boolean loginBerhasil = false;
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Username: ");
                String username = sc.nextLine();
                System.out.print("Masukkan Password: ");
                String password = sc.nextLine();
                for (Admin admin : adminList) {
                    if (admin.login(username, password)) {
                        System.out.println("Login Admin berhasil!");
                        loginBerhasil = true;
                        break;
                    }
                }
                if (!loginBerhasil) {
                    System.out.println("Login gagal! Username atau password salah.");
                }
                break;
            case 2:
                System.out.print("Masukkan Nama: ");
                String namaMahasiswa = sc.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = sc.nextLine();
                for (Mahasiswa mahasiswa : mahasiswaList) {
                    if (mahasiswa.login(namaMahasiswa, nim)) {
                        System.out.println("Login Mahasiswa berhasil!");
                        mahasiswa.printData();
                        loginBerhasil = true;
                        break;
                    }
                }
                if (!loginBerhasil) {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
                break;
            case 3:
                System.out.print("Masukkan Nama: ");
                String namaDosen = sc.nextLine();
                System.out.print("Masukkan NIDN: ");
                String nidn = sc.nextLine();
                for (Dosen dosen : dosenList) {
                    if (dosen.login(namaDosen, nidn)) {
                        System.out.println("Login Dosen berhasil!");
                        dosen.printData();
                        loginBerhasil = true;
                        break;
                    }
                }
                if (!loginBerhasil) {
                    System.out.println("Login gagal! Nama atau NIP salah.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        sc.close();
    }
}
