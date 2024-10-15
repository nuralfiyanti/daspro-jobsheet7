import java.util.Scanner;

public class KafeDoWhile19 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int kopi, teh, roti, hargaKopi = 0, hargaTeh = 0, hargaRoti = 0, totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            hargaKopi = 12000;
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            hargaTeh = 7000;
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            hargaRoti = 20000;

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);

        // Output Transaksi
        System.out.println("Semua transaksi selesai.");
    }   

}
