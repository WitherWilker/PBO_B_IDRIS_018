public class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        boolean namaValid = getNama().equals(inputNama);
        boolean nimValid = getNim().equals(inputNim);

        if(!namaValid) {
            System.out.println("Nama tidak terdaftar!");
        }
        if(!nimValid) {
            System.out.println("NIM tidak valid!");
        }

        return namaValid && nimValid;
    }
    @Override
    public void displayInfo() {
        System.out.println("\n=== MAHASISWA ===");
        super.displayInfo();
    }
}