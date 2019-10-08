package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menghitung rata-rata nilai mahasiswa.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";
    
    //Variabel global
    private static int banyakMahasiswa;
    private static double jumlahNilaiMahasiswa;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputNilaiMahasiswa();
        
        //Menampilkan hasil.
        System.out.println("\nMaka, Rata-rata nilainya adalah " + dapatkanRataRata(jumlahNilaiMahasiswa, banyakMahasiswa));
        
        System.out.println(FOOTER);
    }
    
    public static void inputNilaiMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        
        //Menginputkan banyaknya mahasiswa.
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakMahasiswa = scanner.nextInt();
        
        //Memasukkan nilai dan menghitung jumlah keseluruhan nilai.
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            jumlahNilaiMahasiswa = jumlahNilaiMahasiswa + scanner.nextInt();
        }
    }
    
    public static double dapatkanRataRata(double jumlahNilai, int banyakNilai) {
        return jumlahNilai / banyakNilai;
    }
    
}
