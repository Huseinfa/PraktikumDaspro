import java.util.Scanner;

    public class NestedLoop14 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] suhu = new double[2][4];
        
        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i + 1));

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.println("   Suhu ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextInt();

                
                
            // }
            // for (int k = 0; k < suhu.length; k++) {
            // System.out.println("KOTA KE-" + (i + 1));

            // for (int j = 0; j < suhu[i].length; j++) {
            //     System.out.println(suhu[i][j] + " ");
            // }
            // System.out.println();
                }
            for (double suhuKota : suhu[i]) {
                System.out.println(suhuKota + " ");
                    
                }
            System.out.println();
                
            }
            }
        }