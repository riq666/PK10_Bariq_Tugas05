package pk10_tugas05_08c;

import java.util.Scanner;

/**
 * objek akun 3
 * @author Bariq 13/06-2024
 */

public class PK10_Tugas05_08c 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Akun3 akun1 = new Akun3 ("Budi", 4000000.0);
        Akun3 akun2 = new Akun3 ("Jarwo", 3000000.0);
        
        // menampilkan saldo dari setiap objek
        System.out.println("Saldo " + akun1.getNama() +"\t"+ akun1.setSaldo());
        System.out.println("Saldo " + akun2.getNama() +"\t"+ akun2.setSaldo());
        
        // Scanner untuk mendapat input dari keyboard
        Scanner kibord = new Scanner (System.in);
        
        System.out.print("Entri nominal setoran untuk akun 1 "); // prompt
        double jumlahSetor = kibord.nextDouble(); // peroleh input pengguna
        System.out.println("menambahakan ke saldo akun1 " + jumlahSetor);
        akun1.setor(jumlahSetor); //tambah ke saldo akun 1
        
        // tampilkan saldo
        System.out.println("Saldo " + akun1.getNama() +"\t"+ akun1.setSaldo());
        System.out.println("Saldo " + akun2.getNama() +"\t"+ akun2.setSaldo());
        
        System.out.print("Entri nominal setoran untuk akun 2 "); // prompt
        jumlahSetor = kibord.nextDouble(); // peroleh input pengguna
        System.out.println("menambahakan ke saldo akun2 " + jumlahSetor);
        akun2.setor(jumlahSetor); //tambah ke saldo akun 2
        
         // tampilkan saldo
        System.out.println("Saldo " + akun1.getNama() + "\t"+ akun1.setSaldo());
        System.out.println("Saldo " + akun2.getNama() + "\t"+ akun2.setSaldo());
    } 
} // akhir kelas