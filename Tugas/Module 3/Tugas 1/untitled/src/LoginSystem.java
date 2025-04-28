import java.util.Scanner;

// mettod dalam codingan ini ada 1 yaitu main, sedangkan bila mettod panggilan ada 7
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data dummy
        Admin admin = new Admin("Idris Si Admin", "202410370110018", "anjay", "admin321");
        Mahasiswa mhs = new Mahasiswa("Idris Saputra", "202410370110018");

        while(true) {
            System.out.println("\n=== SILAHKAN LOGIN ===");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih role (1-3): ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine(); // Membersihkan newline
            } catch(Exception e) {
                System.out.println("Input harus angka!");
                sc.nextLine();
                continue;
            }

            if(choice == 3) {
                System.out.println("Terima kasih, program selesai.");
                break;
            }

            User user = null;
            String credential1 = "";
            String credential2 = "";

            switch(choice) {
                case 1:
                    user = admin;
                    System.out.print("Username: ");
                    credential1 = sc.nextLine();
                    System.out.print("Password: ");
                    credential2 = sc.nextLine();
                    break;
                case 2:
                    user = mhs;
                    System.out.print("Nama: ");
                    credential1 = sc.nextLine();
                    System.out.print("NIM: ");
                    credential2 = sc.nextLine();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }

            if(user.login(credential1, credential2)) {
                user.displayInfo();
                System.out.println("\nTekan enter untuk kembali ke menu...");
                sc.nextLine();
            } else {
                System.out.println("\nLogin gagal! Kredensial tidak valid.");
                System.out.println("Tekan enter untuk mencoba lagi...");
                sc.nextLine();
            }
        }

        sc.close();
    }
}