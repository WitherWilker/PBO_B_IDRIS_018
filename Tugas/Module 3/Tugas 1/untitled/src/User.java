public class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if(nama != null && !nama.isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Nama tidak valid!");
        }
    }

    // Getter dan Setter untuk nim
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if(nim != null && !nim.isEmpty()) {
            this.nim = nim;
        } else {
            System.out.println("NIM tidak valid!");
        }
    }

    public boolean login(String credential1, String credential2) {
        return false;
    }

    public void displayInfo() {
        System.out.println("\nInformasi User:");
        System.out.println("Nama: " + getNama()); // Mengakses via getter
        System.out.println("NIM: " + getNim());   // Mengakses via getter
    }
}