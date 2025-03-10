class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Constructor
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println("-------------------------");
    }

    // Menyetor uang ke rekening
    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil menyetor Rp" + jumlah);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0.");
        }
        System.out.println("Saldo saat ini: Rp" + saldo);
        System.out.println("-------------------------");
    }

    // Menarik uang dari rekening
    public void tarikUang(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Berhasil menarik Rp" + jumlah);
        } else {
            System.out.println("Transaksi gagal! Saldo tidak mencukupi atau jumlah tidak valid.");
        }
        System.out.println("Saldo saat ini: Rp" + saldo);
        System.out.println("-------------------------");
    }
}
