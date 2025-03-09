import java.util.Scanner;

class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {

            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            String validUsername = "Christian";
            String validPassword = "ror123";

            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {

            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            String validnama = "Muhammad Idris Dwi Saputra";
            String validNIM = "202410370110018";

            if ( nama.equals(validnama) && nim.equals(validNIM)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + validnama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}