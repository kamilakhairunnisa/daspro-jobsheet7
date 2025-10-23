import java.util.Scanner;

public class kafeDoWhile_08 {
        public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int kopi,teh,roti,totalHarga;

        String namapelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
    

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal'vuntuk keluar): ");
            namapelanggan = sc.nextLine();
            if (namapelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.println("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Tota yang harus dibayar : RP " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
        sc.close();
    }

}
