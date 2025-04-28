public class Mahasiswa {
    public boolean login(String nama, String nim) {
        return nama.equals("202410370110018") && nim.equals("naylaz91!");
    }

    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil.");
        System.out.println("Nama: M.Idris Dwi Saputra");
        System.out.println("NIM : 202410370110018");
    }
}