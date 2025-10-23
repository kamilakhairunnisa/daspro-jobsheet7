import java.util.Scanner;
public class Tugas1_08 {
    public static void main(String[] args) {
    Scanner sc= new Scanner (System.in); 

        int HARGA_TIKET = 50000;
        
        // untuk menghitung total penjualan harian
        int totalPenjualanHarian = 0;
        int totalTiketTerjual = 0;
        
        //  lokal untuk setiap transaksi
        int jumlahTiket, harga= 0;
        double diskon = 0;
        int hargaTransaksi = 0;
        
        String inputLanjut; // Untuk menentukan apakah akan melanjutkan transaksi
        
        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");

        do {
            System.out.println("\n-------------------------------------");
            
            do {
                System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
                if (sc.hasNextInt()) {
                    jumlahTiket = sc.nextInt();
                    if (jumlahTiket < 0) {
                        System.out.println(" Jumlah tiket tidak valid. Silakan masukkan angka non-negatif.");
                    }
                } else {
                    System.out.println(" Input tidak valid. Masukkan hanya angka.");
                    sc.nextInt(); 
                    jumlahTiket = -1; 
                }
                
            } while (jumlahTiket < 0);
            sc.nextLine(); 
            if (jumlahTiket == 0) {
                break; 
            }

            // Tentukan Diskon
            if (jumlahTiket > 10) {
                diskon = 0.15; // Diskon 15%
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // Diskon 10%
            } else {
                diskon = 0.0; // Tidak ada diskon
            }
            
            // 2. Hitung Harga Transaksi
            int hargaBruto = (int)jumlahTiket * HARGA_TIKET;
            int jumlahDiskon = (int)(hargaBruto * diskon);
            hargaTransaksi = hargaBruto - jumlahDiskon;

            // 3. Update Total Harian
            totalPenjualanHarian += hargaTransaksi;
            totalTiketTerjual += jumlahTiket;

            // Tampilkan rincian transaksi
            System.out.println("\n--- Rincian Transaksi ---");
            System.out.println("Harga Bruto    : Rp " + hargaBruto);
            System.out.println("Diskon (" + (int)(diskon * 100) + "%) : Rp " + jumlahDiskon);
            System.out.println("Total Bayar    : Rp " + hargaTransaksi);
            System.out.println("-------------------------");
            
        } while (true); 

        System.out.println("\n==========================================");
        System.out.println("=== RINGKASAN PENJUALAN HARI INI ===");
        System.out.println("Total Tiket Terjual: " + totalTiketTerjual + " tiket");
        System.out.println("Total Penjualan: Rp " + totalPenjualanHarian);
        System.out.println("==========================================");

        sc.close();
    }
}
    
