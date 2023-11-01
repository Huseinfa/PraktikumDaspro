import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayint;
        int key, p;

        System.out.println("Masukkan jumlah elemen array: ");
        p = sc.nextInt();
        arrayint = new int[p];

        for (int i = 0; i < arrayint.length; i++) {
            System.out.println("Masukkan elemen array ke-" + i);
            arrayint[i] = sc.nextInt();
        }

        System.out.println("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        int count = 0;

        System.out.print("Key ada dalam array pada posisi indeks ke:");

        for (int i = 0; i < arrayint.length; i++) {
            if (key == arrayint[i]) {
                System.out.print(" " + i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Key tidak dapat ditemukan di dalam array");
        }
    }
}

