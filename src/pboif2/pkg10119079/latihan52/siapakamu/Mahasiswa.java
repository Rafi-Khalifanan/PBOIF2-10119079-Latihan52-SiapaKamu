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
public class Mahasiswa extends Manusia{
    private String nim, kelas;
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim=nim;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas=kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang belajar di kelas " + kelas);
    }
    
    public void siapaKamu(){
        System.out.println("Saya mahasiswa");
    }
}

