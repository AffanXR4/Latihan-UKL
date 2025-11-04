import java.util.Scanner;

public class SoalTiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU PROGRAM =====");
            System.out.println("1. Rekap Nilai Siswa dan Hitung Rata-rata");
            System.out.println("2. Penjumlahan Dua Matriks");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungRataNilai(input);
                    break;
                case 2:
                    penjumlahanMatriks(input);
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
    // Menghitung rata-rata nilai siswa
    public static void hitungRataNilai(Scanner input) {
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double total = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            total += nilai;
        }

        double rataRata = total / jumlahSiswa;
        System.out.println("Rata-rata nilai seluruh siswa adalah: " + rataRata);
    }

    
    // ================== FUNGSI 2 ==================
    // Penjumlahan dua matriks
    public static void penjumlahanMatriks(Scanner input) {
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("\nMasukkan elemen-elemen Matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMasukkan elemen-elemen Matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB[i][j] = input.nextInt();
            }
        }

        // Hitung hasil penjumlahan
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Tampilkan hasil
        System.out.println("\n=== HASIL PENJUMLAHAN MATRKS (A + B) ===");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
