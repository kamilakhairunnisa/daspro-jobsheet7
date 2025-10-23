import java.util.Scanner;

public class Tugas2_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int durasi, jenis;     
        int totalBayar = 0; 



        while (true) {
            System.out.println("Pilih jenis kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan (0/1/2): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break; // keluar dari loop
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid! Masukkan 1 atau 2 saja.");
                continue; // ulang input
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                totalBayar += 12500;
            } else if (jenis == 1) {
                totalBayar += durasi * 3000;
            } else if (jenis == 2) {
                totalBayar += durasi * 2000;
            }

            System.out.println("Biaya kendaraan ini berhasil ditambahkan.\n");
        }

        System.out.println("\nTotal pembayaran parkir hari ini: Rp " + totalBayar);
        System.out.println("Program selesai.");
    }
}