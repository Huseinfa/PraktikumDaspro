import java.util.Scanner;

//     public class Selection14 {
//         public static void main(String[] args){
//             Scanner input = new Scanner(System.in);

//             int number;

//             System.out.println("Enter a Number: ");
//             number = input.nextInt();

//             if(number % 2 == 0) {
//                 System.out.println("Even number");
//             } else {
//                 System.out.println("Odd number");
//             }
//         }

// }

    public class Selection1 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int number;

            System.out.println("Enter a Number: ");
            number = input.nextInt();

             String output = (number % 2==0) ?   "Even number" : "Odd number";
             System.out.println(output);
             
        }

}
