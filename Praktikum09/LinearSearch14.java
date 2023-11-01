import java.util.Scanner;
    public class LinearSearch14 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        
    int[] arrayint;
    int key,hasil = -1,p;
    System.out.println("Masukkan jumlah elemen array: ");
    p = sc.nextInt();
    arrayint = new int[p];
    
    for (int i = 0; i < arrayint.length; i++) {
        
        System.out.println("Masukkan elemen array ke-" + i);
        arrayint[i] = sc.nextInt();
    }
        System.out.println("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

    for (int i = 0; i < arrayint.length; i++) {
        if (key == arrayint[i]) {
            hasil = i;
            break;
            }
        }
        
        if (hasil != -1) {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak dapat ditemukan di dalam array");
        }
    }
}
