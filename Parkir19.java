import java.util.Scanner;

public class Parkir19 {
    
    public static void main(String[] args) {
        
        //deklarasi input
        Scanner sc = new Scanner(System.in);
        
        //deklarasi variabel
        int jenis, durasi, total=0;

        //deklarasi perulangan do
        do {
            System.out.println("Jenis jenis kendaraan");
            System.out.println("2. Mobil");
            System.out.println("2. Motor");
            System.out.println("0.Keluar");
            System.out.println("Masukkan jens kendaraan: ");
            jenis = sc.nextInt();
            
                if(jenis==1 || jenis==2) {
                    System.out.println("Masukkan durasi: ");
                    durasi = sc.nextInt();
                    if (durasi >5) {
                        total +=12500;
                    } else {
                        if (jenis ==1) {
                            total += durasi*3000;
                        } else {
                            total += durasi*2000;
                        }
                    }
                }
    } while (jenis!=0);
        System.out.println("Total= " +total);
    }
}
