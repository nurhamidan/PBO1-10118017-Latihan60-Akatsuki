package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini turunan dari class Karakter, karena pengguna pedang adalah karakter,
 *                        namun memiliki atribut sedikit berbeda.
 * 
 */
public class PenggunaPedang extends Karakter {
    private String namaPedang;

    public PenggunaPedang(String namaPedang, String namaKarakter, String jenisKelamin) {
        super(namaKarakter, jenisKelamin);
        this.namaPedang = namaPedang;
    }

    public String getNamaPedang() {
        return namaPedang;
    }

    public void setNamaPedang(String namaPedang) {
        this.namaPedang = namaPedang;
    }
}
