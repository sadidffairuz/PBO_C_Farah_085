import java.sql.SQLOutput;
/*import java.util.Scanner;

class Admin {
    private String namaAdmin;
    private String sandiAdmin;

    public Admin(String namaAdmin, String sandiAdmin) {
        this.namaAdmin = namaAdmin;
        this.sandiAdmin = sandiAdmin;
    }

    public boolean login(String inputNamaAdmin, String inputSandiAdmin) {
        return namaAdmin.equals(inputNamaAdmin) && sandiAdmin.equals(inputSandiAdmin);
    }
}

class Mahasiswa {
    private String namaMahasiswa;
    private String nim;

    public Mahasiswa(String namaMahasiswa, String nim) {
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
    }

    public  boolean login(String inputNamaMahasiswa, String inputNim) {
        return namaMahasiswa.equals(inputNamaMahasiswa) && nim.equals(inputNim);
    }

    public void tampilData() {
        System.out.println("Nama: " + namaMahasiswa);
        System.out.println("NIM: " + nim);
    }
}

public class sistemLoginPackage {
    public static void main(String[] args) {
        Scanner inputLogin = new Scanner(System.in);

        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("Masukkan pilihan: ");
        int pilih = inputLogin.nextInt();
        inputLogin.nextLine();

        if(pilih == 1) {
            System.out.println("Masukkan Username: ");
            String namaAdmin = inputLogin.nextLine();
            System.out.println("Masukkan Password: ");
            String sandiAdmin = inputLogin.nextLine();

            Admin admin = new Admin("Admin085", "Password085");
            if(admin.login(namaAdmin, sandiAdmin)) {
                System.out.println("Login Admin berhasil!");
            } else  {
                System.out.println("Login gagal! Username atau Password salah!");
            }
        } else if (pilih == 2) {
            System.out.println("Masukkan Nama: ");
            String namaMahasiswa = inputLogin.nextLine();
            System.out.println("Masukkan NIM: ");
            String nim = inputLogin.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa("Farah", "2024_085");
            if(mahasiswa.login(namaMahasiswa, nim)) {
                System.out.println("Login Mahasiswa berhasil!");
            } else  {
                System.out.println("Login gagal! Nama atau NIM salah!");
            }
        } else  {
            System.out.println("Pilihan tidak valid!!");
        }

        inputLogin.close();
    }

}
*/