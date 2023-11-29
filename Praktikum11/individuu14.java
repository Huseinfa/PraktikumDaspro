import java.util.Scanner;

    public class individuu14 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ganjil = false;
        
        System.out.println("Masukkan Angka Ganjil : ");
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            ganjil = false;
            System.out.println("Masukkan angka ganjil!");
        } else {
            ganjil = true;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");

                    }else{
                    System.out.print(  "  ");
                    }
                    
                }
                System.out.println();
                
            }
            
        }

            
        

    }
}
