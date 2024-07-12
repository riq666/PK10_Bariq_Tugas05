package pk10_tugas05_08a;

// Fig. 3.1: Account.java
// Account class that contains a nama instance variable 
// and methods to set and get its value.

/**
 *
 * @author Bariq
 */

public class Akun 
{
    private String nama; // instance variable
    // metode untuk menyetting nama di objek
    public void setNama(String nama) 
    { 
        this.nama = nama; // menyimpan nama
    } 
    // metode untuk memuat nama dari objek
    public String getNama() 
    { 
        return nama; // mengembalikan nama ke pemanggil
    } 

}// akhir kelas

