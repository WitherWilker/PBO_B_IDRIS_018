public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyooor");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Hok Hok");

        // Menampilkan informasi dari kedua objek
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}