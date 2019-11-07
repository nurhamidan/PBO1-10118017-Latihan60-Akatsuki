package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini adalah class tertinggi dalam hirarki.
 * 
 */
public class Karakter {
    private final String namaKarakter;
    private final String jenisKelamin;
    private String desa;

    public Karakter(String namaKarakter, String jenisKelamin) {
        this.namaKarakter = namaKarakter;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaKarakter() {
        return namaKarakter;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa, Desa[] daftarDesa) {
        for (Desa daftarDesa1 : daftarDesa) {
            if (desa.toUpperCase().equals(daftarDesa1.getNamaDesa().toUpperCase())) {
                this.desa = daftarDesa1.getNamaDesa();
            }
        }
    }
    
    public void tampilkanKarakter() {
        System.out.println("Nama : " + namaKarakter);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        if (desa == null) {
            System.out.println("Asal Desa : Tidak diketahui");
        } else {
            System.out.println("Asal Desa : " + desa);
        }
    }
}
