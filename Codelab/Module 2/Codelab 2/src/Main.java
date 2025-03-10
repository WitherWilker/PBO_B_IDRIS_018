public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening pertama
        RekeningBank rekening1 = new RekeningBank("202410370110018", "Idris Saputra", 850000);

        // Membuat objek rekening kedua
        RekeningBank rekening2 = new RekeningBank("085755564904", "Christian Kenzo", 500000);

        // Menampilkan informasi rekening
        System.out.println("=== Informasi Rekening 1 ===");
        rekening1.tampilkanInfo();

        System.out.println("=== Informasi Rekening 2 ===");
        rekening2.tampilkanInfo();

        // Melakukan transaksi pada rekening pertama
        System.out.println("=== Transaksi Rekening 1 ===");
        rekening1.setorUang(200000);
        rekening1.tarikUang(100000);

        // Melakukan transaksi pada rekening kedua
        System.out.println("=== Transaksi Rekening 2 ===");
        rekening2.setorUang(150000);
        rekening2.tarikUang(700000); // Ini akan gagal karena saldo kurang

        // Menampilkan informasi rekening setelah transaksi
        System.out.println("=== Informasi Akhir Rekening 1 ===");
        rekening1.tampilkanInfo();

        System.out.println("=== Informasi Akhir Rekening 2 ===");
        rekening2.tampilkanInfo();
    }
}
