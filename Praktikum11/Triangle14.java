import java.util.Scanner;

    public class Triangle14 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah *: ");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n) {
            
            int j = 0;
            while (j < i) {
                j++;
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
    }
}
