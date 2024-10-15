import java.util.Scanner;

public class Bioskop19 {
  
    public static void main(String[] args) {
        
        //deklarasi input
        Scanner sc = new Scanner(System.in);
    
        //deklarasi variabel
        int jumTiket, hargaTiket, diskon, totalTiket=0, totalHarga=0;
        boolean isLanjut = true;

        //menggunakan perulangan while
        while(isLanjut) {
            System.out.print("input jumlah tiket: ");
            jumTiket = sc.nextInt();
            if(jumTiket<=0) {
                System.out.println("input invalid! ");
                continue;
            } else {
                hargaTiket=jumTiket*50000;
                if(jumTiket>10) {
                    diskon=(int) (0.15*hargaTiket);
                }else if(jumTiket>4) {
                    diskon=(int) (0.1*hargaTiket);
                } else{
                    diskon=0;
                
                }
                hargaTiket=hargaTiket-diskon;
                totalTiket=totalTiket+jumTiket;
                totalHarga=totalHarga+hargaTiket;
                System.out.print("Lanjut? (true/false): ");
                isLanjut=sc.nextBoolean();
            }
        }
                //output total tiket dan total harga
                System.out.println("Total tiket: " +totalTiket);
                System.out.println("Total harga: "+totalHarga);
    }
}
