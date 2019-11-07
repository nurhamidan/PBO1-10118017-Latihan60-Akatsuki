package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini turunan dari class Karakter, karena pengguna mata adalah karakter,
 *                        namun memiliki atribut sedikit berbeda.
 * 
 */
public class PenggunaMata extends Karakter {
    private String namaMata;

    public PenggunaMata(String namaMata, String namaKarakter, String jenisKelamin) {
        super(namaKarakter, jenisKelamin);
        this.namaMata = namaMata;
    }

    public String getNamaMata() {
        return namaMata;
    }

    public void setNamaMata(String namaMata) {
        this.namaMata = namaMata;
    }
}
