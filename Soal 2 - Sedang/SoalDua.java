import java.util.Scanner;

public class SoalDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU PROGRAM =====");
            System.out.println("1. Hitung Faktorial");
            System.out.println("2. Hitung Volume Tabung");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungFaktorial(input);
                    break;
                case 2:
                    hitungVolumeTabung(input);
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
    // Menghitung faktorial dari bilangan bulat positif
    public static void hitungFaktorial(Scanner input) {
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Bilangan harus positif!");
            return;
        }

        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah " + hasil);
    }

    // ================== FUNGSI 2 ==================
    // Menghitung volume tabung dengan parameter
    public static void hitungVolumeTabung(Scanner input) {
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        double volume = volumeTabung(r, t);
        System.out.println("Volume tabung adalah: " + volume + " cm^3");
    }

    // Fungsi dengan parameter untuk menghitung volume tabung
    public static double volumeTabung(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}
