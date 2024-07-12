package pk10_tugas05_08a;

import java.util.Scanner;

/**
 * objek akun
 * @author Bariq 13/06-2024
 */

public class PK10_Tugas05_08a 
{
    public static void main(String[] args) 
    {
        // membuat objek scanner untuk mendapatkan input dari keyboard
        Scanner kibord = new Scanner(System.in);
        
        // membuat objek akun dan menetapkannya ke akun saya
        Akun akunKu = new Akun(); 
        
        // menampilkan nama awal
        System.out.println("Nama awal adalah: " + akunKu.getNama());
        
        // prompt untuk membaca
        System.out.print("Silakan Ketik Nama Anda: ");
        String namaItu = kibord.nextLine(); // membaca satu baris teks
        akunKu.setNama(namaItu); // menetapkan namaItu ke objek akunKu
        System.out.println(); // baris kosong
        
        // menampilkan nama yang disimpan di objek akunKu
        System.out.println("Nama di objek akunKu adalah: " + akunKu.getNama());
    }
} // akhir kelas
