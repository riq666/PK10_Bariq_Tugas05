package pk10_tugas05_08b;

/**
 * objek akun 2
 * @author Bariq 13/06-2024
 */

public class Akun2 
{
    private String nama; // instance variable
    // metode untuk menyetting nama di objek
    public Akun2 (String nama) // constructor nama
    {
        this.nama = nama;
    }
    public void setNama(String nama) 
    { 
        this.nama = nama; // menyimpan nama
    } 
    // metode untuk memuat nama dari objek
    public String getNama() 
    { 
        return nama; // mengembalikan nama ke pemanggil
    } 

} //akhir kelas