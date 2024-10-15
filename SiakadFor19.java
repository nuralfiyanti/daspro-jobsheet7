import java.util.Scanner;

public class SiakadFor19{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jumlahLulus = 0, jumlahTidakLulus = 0;
        String kategori, lulus, tidakLulus;
       
        for (int i = 1; i <= 10; i++) {
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();

            // Mencari nilai tertinggi
            if(nilai > tertinggi) {
                tertinggi = nilai;
            }

            // Mencari nilai terendah
            if (nilai < terendah) {
                terendah = nilai;
            }

            // Mengecek apakah mahasiswa lulus atau tidak
            if (nilai >= 60) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }   
        
        // Menampilkan hasil 
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        // Menampilkan jumlah mahasiswa yang lulus dan tidak lulus
        System.out.println(("Jumlah mahasiswa yang lulus: " + jumlahLulus));
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);
    }
}
