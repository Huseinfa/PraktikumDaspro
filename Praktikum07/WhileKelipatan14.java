import java.util.Scanner;
    public class WhileKelipatan14 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int bilangan, total = 0, counter = 0,i = 0;
            double rata;

            System.out.println("Masukkan bilangan 1-9: ");
            bilangan = sc.nextInt();

            do {
                if (i % bilangan == 0) {
                total += i;
                counter++;
                }
                    i++;
                    } while (i < 50);

            System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
    }
}