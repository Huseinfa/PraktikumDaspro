import java.util.Scanner;

public class tes {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int bil1, bil2, bil3;

    System.out.println("Masukkan Bilangan 1: ");
    bil1 = sc.nextInt();
    System.out.println("Masukkan Bilangan 2: ");
    bil2 = sc.nextInt();
    System.out.println("Masukkan Bilangan 3: ");
    bil3 = sc.nextInt();


    if (bil1>bil2)
    {
     if (bil2>bil3)
     {
        System.out.println("Bilangan Terbesar adalah: " + bil1);
     }

    else if (bil1>bil3)
     {
         System.out.println("Bilangan Terbesar adalah: " + bil1);

     }
     else 
     {
        System.out.println("Bilangan Terbesar adalah: " + bil3);

     }

    }else {
        if (bil1>bil3)
        {
        System.out.println("Bilangan Terbesar adalah: " + bil2);
        }
        else{
        if (bil2>bil3){
        System.out.println("Bilangan Terbesar adalah: " + bil2);
        }
        else {
        System.out.println("Bilangan Terbesar adalah: " + bil3);

        }
        }
    }

    
}
}
