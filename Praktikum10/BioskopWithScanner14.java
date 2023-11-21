import java.util.Scanner;
    public class BioskopWithScanner14 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean tersedia;
        int baris,kolom,menu;
        String nama,next;
        String[][] penonton = new String[4][2];
        
        while (true) {
            System.out.print("Masukkan nama : ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan Kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            if (penonton[baris-1][kolom-1] == null) {
                tersedia = true;
                penonton[baris-1][kolom-1]= nama;

            } else {
                tersedia = false;
                System.out.println("Kursi tidak tersedia");
                System.out.println("Mohon Pilih kursi yang lain");
            }

            System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
                System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
                System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
                System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);
        }
            

        // do {
        //     if (menu == 1) {
        //     System.out.print("Masukkan nama : ");
        //     nama = sc.nextLine();
        //     System.out.print("Masukkan baris: ");
        //     baris = sc.nextInt();
        //     System.out.print("Masukkan Kolom: ");
        //     kolom = sc.nextInt();
        //     sc.nextLine();

        //     penonton[baris-1][kolom-1]= nama;
                
        //     }else if(menu == 2) {
        //         System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        //         System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        //         System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        //         System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);
        //     }else {
        //         break;
        //     }
        // }while(true);

    }
    
}
