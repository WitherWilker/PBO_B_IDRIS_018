import java.util.Scanner;

public class Loginsystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.print("Login sebagai (1. Admin | 2. Mahasiswa): ");
        int pilih = input.nextInt();
        input.nextLine(); // buang newline

        if (pilih == 1) {
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            if (admin.login(username, password)) {
                System.out.println("Login Admin berhasil.");
            } else {
                System.out.println("Username atau password salah.");
            }

        } else if (pilih == 2) {
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("NIM : ");
            String nim = input.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}