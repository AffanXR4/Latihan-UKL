import java.util.Scanner;

public class SoalSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU PROGRAM =====");
            System.out.println("1. Hitung Biaya Pengiriman");
            System.out.println("2. Cek Bilangan Ganjil / Genap");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungBiayaPengiriman(input);
                    break;
                case 2:
                    cekGanjilGenap(input);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

        } while (pilihan != 3);
    }

    // ================== FUNGSI 1 ==================
    public static void hitungBiayaPengiriman(Scanner input) {
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double biayaPerKg = (jarak <= 10) ? 4250 : 6000;
        double total = berat * biayaPerKg;

        if (volume > 100) {
            total += 50000;
        }

        System.out.println("\n=== RINCIAN BIAYA ===");
        System.out.println("Volume: " + volume + " cm^3");
        System.out.println("Biaya per kg: Rp " + biayaPerKg);
        System.out.println("Total biaya: Rp " + total);
    }

    // ================== FUNGSI 2 ==================
    public static void cekGanjilGenap(Scanner input) {
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
    }
}
