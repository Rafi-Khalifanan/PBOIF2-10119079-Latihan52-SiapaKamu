package pboif2.pkg10119079.latihan52.siapakamu;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan52SiapaKamu {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        d.setNip("41227829930");
        System.out.println("NIP DOSEN: " + d.getNip());
        d.setNama("Rizki Adam Kurniawan");
        d.setUmur(27);
        d.setMataKuliah("PBO");
        d.siapaKamu();
        d.mengajarApa();
        
        Mahasiswa m = new Mahasiswa();
        m.setNim("10110269");
        System.out.println("\nNIM MAHASISWA: " + m.getNim());
        m.setNama("Nindi");
        m.setUmur(17);
        m.setKelas("PBO2");
        m.siapaKamu();
        m.kelasApa();
    }  
}
