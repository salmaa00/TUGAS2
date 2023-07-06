// Salma Salsabila : 227064516069
// Muhammad Raysa Farhan : 227064516100
package TUGAS2;
public class karyawan {
    String NIP; //memasukkan NIP yang bertipe data String
    String nama; //memasukkan nama yang bertipe data String
    String kelamin; //memasukkan kelamin yang bertipe data String
    int jmlhari; //memasukkan jumlah hari yang bertipe data integer
    int totalgaji; //memasukkan total gaji yang bertipe data integer

void karyawan(){
    System.out.println ("NIP : " + NIP); //untuk menampilkan output NIP
    System.out.println ("Nama : " + nama); //untuk menampilkan output Nama
    System.out.println ("Jenis Kelamin : " + kelamin); //untuk menampilkan output Jenis Kelamin
}
void AbsenKerja (){ //untuk mendeklarasikan fungsi Absen Kerja yang bertipe data String
    System.out.println ("Absen Kerja : " + jmlhari); //untuk menampilkan output absen kerja + jumlah hari
}
void HitungGaji (){ //untuk mendeklarasikan fungsi Hitung Gaji yang bertipe data String
    System.out.println ("Gaji : " + (jmlhari*100000)); //untuk menampilkan output Gaji + jumlah hari x 100000
    }
}
class Dosen extends karyawan{ //untuk menggabungkan class Dosen dan memanggil class karyawan
    String golongan; //memasukkan golongan yang bertipe data string
    int SKS; //memasukkan SKS yang bertipe data integer
    int upahtotal; //memasukkan upahtotal yang bertipe data integer
    void HitungGaji(){ //untuk mendeklarasikan Hitung Gaji yang bertipe data String
        System.out.println ("Total Gaji : " + (SKS*upahtotal*jmlhari)); //untuk menampilkan output Total Gaji + SKS x upah total x jumlah hari
    }
}
class staff extends karyawan{ //untuk menggabungkan class staff dan memanggil class karyawan
}
