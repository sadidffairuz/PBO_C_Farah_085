import java.util.Scanner;

class Admin {
    private String username = "admin085";
    private String password = "password085";

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public boolean login(String nama, String nim) {
        return this.nama.equals(nama) && this.nim.equals(nim);
    }

    public void displayInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
    }
}

class LoginSystemNewMod2 {
    private Admin admin;
    private Mahasiswa mahasiswa;

    public LoginSystemNewMod2() {
        admin = new Admin();
        mahasiswa = new Mahasiswa("Farah Fairuz Sadidah", "202410370110085");
    }

    public void start() {
        Scanner inputLogin = new Scanner(System.in);

        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("Masukkan pilihan: ");
        int pilih = inputLogin.nextInt();
        inputLogin.nextLine();

        if (pilih == 1) {
            System.out.print("Masukkan username: ");
            String username = inputLogin.nextLine();
            System.out.print("Masukkan password: ");
            String password = inputLogin.nextLine();

            if (admin.login(username, password)) {
                System.out.println("Login berhasil sebagai Admin!");
            } else {
                System.out.println("Username atau password salah.");
            }
        } else if (pilih == 2) {
            System.out.print("Masukkan nama: ");
            String nama = inputLogin.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = inputLogin.nextLine();

            if (mahasiswa.login(nama, nim)) {
                System.out.println("Login berhasil sebagai Mahasiswa!");
                mahasiswa.displayInfo();
            } else {
                System.out.println("Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        inputLogin.close();
    }

    public static void main(String[] args) {
        LoginSystemNewMod2 loginSystem = new LoginSystemNewMod2();
        loginSystem.start();
    }
}

