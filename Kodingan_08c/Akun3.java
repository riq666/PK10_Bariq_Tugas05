package pk10_tugas05_08c;

// Fig. 3.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

/**
 * objek akun 3
 * @author Bariq 13/06-2024
 */

public class Akun3 
{
 private String nama; // variabel instant
 private double saldo; // variabel langsung jadi
 
    // constructor akun3 punya 2 parameter yaitu, nama dan saldo
     public Akun3 (String nama, double saldo) // constructor nama
    {
        this.nama = nama; //tetapkan nama u/ variabel nama instan
        // validasi bhwa saldo > dari 0; jika tidak variabel saldo instan
        // tetap menampilkan nilai awal 0
        if ( saldo > 0.0) // jika saldo valid
            this.saldo = saldo; //menetapkannya ke variabel saldo instan
    }
    
    // metode yang menambahkan bila setoran nilainya valid
    public void setor (double jumlahSetor)
    {
        if ( jumlahSetor > 0.0 ) // jika setoran valid
            saldo = saldo + jumlahSetor; //menambahkan ke saldo
    }
    // metode mengembalikan saldo akun
    public double setSaldo()
    {
        return saldo;
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

}// akhir kelas