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
public class Dosen extends Manusia {
    private String nip, mataKuliah;
    
    public String getNip(){
        return nip;
    }
    
    public void setNip(String nip){
        this.nip=nip;
    }
    
    public String mataKuliah(){
        return mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah){
        this.mataKuliah=mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang mengajar matakuliah " + mataKuliah);
    }
    
    public void siapaKamu(){
        System.out.println("Saya dosen");
    }
}
