import java.util.Scanner;

public class ForKelipatan14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int bilangan, total = 0, counter = 0;
        double rata;

        System.out.println("Masukkan Bilangan 1-9: ");
        bilangan = sc.nextInt();

        for (int i = 0; i < 50; i++) {
            if (i % bilangan == 0) {
                total += 1;
                counter++;

            }
        }

        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d ", counter, bilangan, total);


        rata =(double) total / counter;
        System.out.println("Rata-rata dari seluruh bilangan adalah: " + rata);
    }

}