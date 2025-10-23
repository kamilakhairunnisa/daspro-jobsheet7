import java.util.Scanner;

public class SiakadFor08 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0;
        int tidakLulus = 0; 

        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            
            if (nilai >= 60) {
                lulus++; 
            } else {
                tidakLulus++; 
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        sc.close(); 
        System.out.println("\n--- Hasil Rekapitulasi Nilai ---");
        System.out.println("Jumlah Mahasiswa LULUS       : " + lulus + " orang");
        System.out.println("Jumlah Mahasiswa TIDAK LULUS : " + tidakLulus + " orang");
        System.out.println("Nilai Tertinggi              : " + tertinggi);
        System.out.println("Nilai Terendah               : " + terendah);
    }
}