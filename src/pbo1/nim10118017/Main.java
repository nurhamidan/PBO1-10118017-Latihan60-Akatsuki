package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class main, dimana class yang pertama dijalankan.
 * 
 */
public class Main {
    public static Desa[] daftarDesa;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        daftarDesa = new Desa[18];
        
        for (int i = 0; i < daftarDesa.length; i++) {
            daftarDesa[i] = new Desa();
        }
        
        daftarDesa[0].setNamaDesa("Konohagakure");
        daftarDesa[1].setNamaDesa("Otogakure");
        daftarDesa[2].setNamaDesa("Sunagakure");
        daftarDesa[3].setNamaDesa("Takumi no Sato");
        daftarDesa[4].setNamaDesa("Moyagakure");
        daftarDesa[5].setNamaDesa("Kirigakure");
        daftarDesa[6].setNamaDesa("Kumogakure");
        daftarDesa[7].setNamaDesa("Amegakure");
        daftarDesa[8].setNamaDesa("Hoshigakure");
        daftarDesa[9].setNamaDesa("Iwagakure");
        daftarDesa[10].setNamaDesa("Getsugakure");
        daftarDesa[11].setNamaDesa("Soragakure");
        daftarDesa[12].setNamaDesa("Takigakure");
        daftarDesa[13].setNamaDesa("Tonbogakure");
        daftarDesa[14].setNamaDesa("Kusagakure");
        daftarDesa[15].setNamaDesa("Yugakure");
        daftarDesa[16].setNamaDesa("Yukigakure");
        daftarDesa[17].setNamaDesa("Uzushiogakure");
        
        Organisasi organisasi1 = new Organisasi("Akatsuki");
        
        PenggunaPedang penggunaPedang1 = new PenggunaPedang("Sanjin no Ogama", "Hidan", "Laki-laki");
        penggunaPedang1.setDesa("yugakure", daftarDesa);
        
        Karakter karakter1 = new Karakter("Kakuzu", "Laki-laki");
        karakter1.setDesa("takigakure", daftarDesa);
        
        PenggunaMata penggunaMata1 = new PenggunaMata("Sharingan", "Itachi Uchiha", "Laki-laki");
        penggunaMata1.setDesa("konohagakure", daftarDesa);
        
        PenggunaPedang penggunaPedang2 = new PenggunaPedang("Samehada", "Kisame Hoshigaki", "Laki-laki");
        penggunaPedang2.setDesa("kirigakure", daftarDesa);
        
        Karakter karakter2 = new Karakter("Zetsu", "Laki-laki");
        
        PenggunaMata penggunaMata2 = new PenggunaMata("Sharingan", "Tobi", "Laki-laki");
        
        Karakter karakter3 = new Karakter("Orochimaru", "Laki-laki");
        karakter3.setDesa("konohagakure", daftarDesa);
        
        Karakter karakter4 = new Karakter("Deidara", "Laki-laki");
        karakter4.setDesa("iwagakure", daftarDesa);
        
        Karakter karakter5 = new Karakter("Sasori", "Laki-laki");
        karakter5.setDesa("Sunagakure", daftarDesa);
        
        Karakter karakter6 = new Karakter("Konan", "Perempuan");
        karakter6.setDesa("amegakure", daftarDesa);
        
        PenggunaMata penggunaMata3 = new PenggunaMata("Rinnegan", "Nagato Uzumaki", "Laki-laki");
        penggunaMata3.setDesa("amegakure", daftarDesa);
        Pain pain1 = new Pain(penggunaMata3.getNamaKarakter(), penggunaMata3.getNamaMata(), "Tendo", "Laki-laki");
        Pain pain2 = new Pain(penggunaMata3.getNamaKarakter(), penggunaMata3.getNamaMata(), "Shurado", "Laki-laki");
        Pain pain3 = new Pain(penggunaMata3.getNamaKarakter(), penggunaMata3.getNamaMata(), "Ningendo", "Laki-laki");
        Pain pain4 = new Pain(penggunaMata3.getNamaKarakter(), penggunaMata3.getNamaMata(), "Chikushodo", "Laki-laki");
        Pain pain5 = new Pain(penggunaMata3.getNamaKarakter(), penggunaMata3.getNamaMata(), "Gakido", "Laki-laki");
        Pain pain6 = new Pain(penggunaMata3.getNamaKarakter(), penggunaMata3.getNamaMata(), "Jigokudo", "Laki-laki");
        
        organisasi1.setMember(new Karakter[]{penggunaPedang1, karakter1, penggunaMata1, penggunaPedang2, karakter2, penggunaMata2, karakter3, karakter4, karakter5, karakter6, penggunaMata3});
        
        //Menampilkan
        System.out.println("Daftar desa dalam dunia Naruto:");
        for (int i = 0; i < daftarDesa.length; i++) {
            System.out.println("- Desa " + daftarDesa[i].getNamaDesa());
            if (i == (daftarDesa.length - 1))
                System.out.println("Total desa : " + daftarDesa.length + "\n");
        }
        
        System.out.println("Daftar anggota Akatsuki:");
        for (Karakter memberAkatsuki : organisasi1.getMember()) {
            memberAkatsuki.tampilkanKarakter();
            System.out.println();
        }
        
    }
    
    
}
