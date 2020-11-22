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
public class Manusia {
    protected String nama;
    protected int umur;
    
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setUmur(int umur){
        this.umur=umur;
    }
    
    public void siapaKamu(){
        System.out.println("Saya manusia");
    }
}
