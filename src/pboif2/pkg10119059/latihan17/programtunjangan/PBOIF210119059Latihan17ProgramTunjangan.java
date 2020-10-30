/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menghitung tunjangan
 */
package pboif2.pkg10119059.latihan17.programtunjangan;

import java.util.Scanner;

public class PBOIF210119059Latihan17ProgramTunjangan {


    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String status;
        int gaji, tunj;
        
        
        // Menampilkan Program Tunjangan
        System.out.println("Program Tunjangan");
        System.out.println("=================");
        System.out.print("Berapa gaji pokok anda sebulan? : Rp. ");
        gaji=input.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        status=input.next();
            if (!"Menikah".equals(status)) {
                tunj = 0;
            } else {
                tunj = (int) (0.35*gaji);
            }
        
        int gajiTotal = gaji+tunj;
        System.out.println("");
        System.out.println("~~~~~~~~ Hasil Perhitungan Gaji Anda ~~~~~~~~");
        System.out.println("Gaji Pokok          : " + gaji);
        System.out.println("Tunjangan           : " + tunj);
        System.out.println("Total               : " + gajiTotal);
    }

}
