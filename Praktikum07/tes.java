import java.util.Scanner;
public class tes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama, nim, kembaliMenu;
        int menu;

        while (true) {
            System.out.println("Pilih Menu : ");
            System.out.println("Data Peminjam");
            System.out.println("Data Rental");
            System.out.print("Menu : ");
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.println("Selamat Datang di halaman Data Peminjam");
                System.out.print("Masukkan nama : ");
                nama = sc.next();
                System.out.print("Masukkan nim : ");
                nim = sc.next();
                
                System.out.print("Apakah ingin kembali ke menu (y/t) ? : ");
                kembaliMenu = sc.next();

                if (kembaliMenu.equalsIgnoreCase("y")) {
                    continue;
                } else if (kembaliMenu.equalsIgnoreCase("t")) {
                    break;
                } else {
                    break;
                }
            } else if (menu == 2) {
                if (!nama.equalsIgnoreCase("kembaliMenu")) {

                } else {

                }
            } else {

            }
      }

    }
}