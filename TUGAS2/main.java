// Salma Salsabila : 227064516069
// Muhammad Raysa Farhan : 227064516100
package TUGAS2;
public class main {

    public static void main(String[] args) {
        karyawan manusia1 = new karyawan (); //memanggil class karyawan dan memasukkan data manusia 1
        manusia1.NIP      = "227064516069"; //memasukkan data NIP manusia 1
        manusia1.nama     = "Salma Salsabila"; //memasukkan data nama manusia 1
        manusia1.kelamin  = "Perempuan"; //memasukkan data kelamin manusia 1
        manusia1.jmlhari  = 28; //memasukkan data jumlah hari manusia 1
        manusia1.karyawan (); //memanggil class karyawan
        manusia1.AbsenKerja(); //memanggil class Absen Kerja
        manusia1.HitungGaji(); //memanggil class Hitung Gaji
        System.out.println(); 
        
        karyawan manusia2 = new karyawan (); //memanggil class karyawan dan memasukkan data manusia 2
        manusia2.NIP      = "227064516100"; //memasukkan data NIP manusia 2
        manusia2.nama     = "Muhammad Raysa Farhan"; //memasukkan data nama manusia 2
        manusia2.kelamin  = "Laki-Laki"; //memasukkan data kelamin manusia 2
        manusia2.jmlhari  = 25; //memasukkan data jumlah hari manusia 2
        manusia2.karyawan(); //memanggil class karyawan
        manusia2.AbsenKerja(); //memanggil class Absen Kerja
        manusia2.HitungGaji(); //memanggil class Hitung Gaji
    }
}
   
