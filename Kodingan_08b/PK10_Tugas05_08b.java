package pk10_tugas05_08b;

/**
 * objek akun 2
 * @author Bariq 13/06-2024
 */

public class PK10_Tugas05_08b 
{
    public static void main(String[] args) 
    {
        // membuat dua objek akun
        Akun2 akun1 = new Akun2("Jane Green");
        Akun2 akun2 = new Akun2("John Blue");
        
        // tampilkan isi awal setiap akun
        System.out.println("Nama Pemilik akun1 adalah: " + akun1.getNama());
        System.out.println("Nama Pemilik akun2 adalah: " + akun2.getNama());
    }
} //akhir kelas