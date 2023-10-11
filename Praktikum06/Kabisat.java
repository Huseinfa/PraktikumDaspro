import java.util.Scanner;

    public class Kabisat {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int tahun;
            
            System.out.println("Masukkan Tahun: ");
            tahun = sc.nextInt();

            String result = (tahun % 4 == 0 && tahun % 100 !=0) ? "Tahun Kabisat" : "Bukan Tahun Kabisat";
            System.out.println(result);
    
    }
}