import java.util.Scanner;

public class ArrayNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        double sum = 0;
        double rata;
        double jumlah = 0;
        int max = 0,min = 100,lulus=0,tidaklulus=0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai akhir mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
            sum = sum + nilaiAkhir[i];

            if (nilaiAkhir[i] > max) {
                max = nilaiAkhir[i];
            }
            if (nilaiAkhir[i] < min) {
                min = nilaiAkhir[i];
            }
        }
        rata = sum / nilaiAkhir.length;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " lulus");
            lulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " tidak lulus");
            tidaklulus++;
            }
        }

        System.out.println("Rata-rata Nilai: " + rata);
        System.out.println("Nilai Tertinggi: " + max);
        System.out.println("Nilai Terendah: " + min);
        System.out.println("Jumlah Mahasiswa Lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + tidaklulus);
    }
}
