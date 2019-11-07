package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini independent, hanya untuk menampung organisasi.
 * 
 */
public class Organisasi {
    private String namaOrganisasi;
    private Karakter[] member;

    public Organisasi(String namaOrganisasi) {
        this.namaOrganisasi = namaOrganisasi;
    }

    public String getNamaOrganisasi() {
        return namaOrganisasi;
    }

    public void setNamaOrganisasi(String namaOrganisasi) {
        this.namaOrganisasi = namaOrganisasi;
    }

    public Karakter[] getMember() {
        return member;
    }

    public void setMember(Karakter[] member) {
        this.member = member;
    }
}
