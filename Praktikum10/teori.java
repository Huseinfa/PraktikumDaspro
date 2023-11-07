import java.util.Scanner;

public class teori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number of rows:");
        int jmlbrs = sc.nextInt();

        System.out.println("Input the number of columns:");
        int jmlklm = sc.nextInt();

        int[][] y = new int[jmlbrs][jmlklm];

        System.out.println("Enter values for specific rows and columns:");

        while (true) {
            System.out.print("Enter the row number (1 to " + jmlbrs + ") or -1 to finish: ");
            int row = sc.nextInt();

            if (row == -1) {
                break; // Exit the loop if the user enters -1
            }

            if (row < 1 || row > jmlbrs) {
                System.out.println("Invalid row number. Please enter a valid row number.");
                continue; // Continue to the next iteration of the loop
            }

            System.out.print("Enter the column number (1 to " + jmlklm + "): ");
            int col = sc.nextInt();

            if (col < 1 || col > jmlklm) {
                System.out.println("Invalid column number. Please enter a valid column number.");
                continue; // Continue to the next iteration of the loop
            }

            System.out.print("Enter the value for row " + row + " and column " + col + ": ");
            y[row - 1][col - 1] = sc.nextInt();
        }

        System.out.println("The matrix you entered:");
        for (int i = 0; i < jmlbrs; i++) {
            for (int j = 0; j < jmlklm; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//         System.out.println("Input the number of rows:");
//         int jmlbrs = sc.nextInt();

//         System.out.println("Input the number of columns:");
//         int jmlklm = sc.nextInt();

//         int[][] y = new int[jmlbrs][jmlklm];

//         for (int i = 0; i < jmlbrs; i++) {
//             for (int j = 0; j < jmlklm; j++) {
//                 System.out.print("Input value for row " + (i + 1) + " and column " + (j + 1) + ": ");
//                 y[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("The matrix you entered:");
//         for (int i = 0; i < jmlbrs; i++) {
//             for (int j = 0; j < jmlklm; j++) {
//                 System.out.print(y[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
