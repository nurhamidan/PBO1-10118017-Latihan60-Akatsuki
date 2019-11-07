package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Semua pain adalah pengguna mata.
 * 
 */
public class Pain extends PenggunaMata {
    public final String pengendali;

    public Pain(String pengendali, String namaMata, String namaKarakter, String jenisKelamin) {
        super(namaMata, namaKarakter, jenisKelamin);
        this.pengendali = pengendali;
    }

    public String getPengendali() {
        return pengendali;
    }
}
