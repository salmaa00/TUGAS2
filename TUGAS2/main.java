// Salma Salsabila : 227064516069
// Muhammad Raysa Farhan : 227064516100
package TUGAS2;
public class main {

    public static void main(String[] args) {
         karyawan manusia1 = new karyawan ();
        manusia1.NIP      = "227064516069";
        manusia1.nama     = "Salma Salsabila";
        manusia1.kelamin  = "Perempuan";
        manusia1.jmlhari  = 28;
        manusia1.karyawan ();
        manusia1.AbsenKerja();
        manusia1.HitungGaji();
        System.out.println();
        
        karyawan manusia2 = new karyawan ();
        manusia2.NIP      = "227064516100";
        manusia2.nama     = "Muhammad Raysa Farhan";
        manusia2.kelamin  = "Laki-Laki";
        manusia2.jmlhari  = 25;
        manusia2.karyawan();
        manusia2.AbsenKerja();
        manusia2.HitungGaji();
    }
}
   
