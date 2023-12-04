// public class tugasindiduteori {
//     // public static void main(String[] args) {

//     //     String walikan = "DasarPemrograman";
//     //     // String[] kata = walikan.split("*",40);

//     //     System.out.println(String.join(" ", walikan.split("")));

//     //     // for (String a : kata) {
//     //     //     System.out.println(a);
//     //     }

//         public String reverseString(String str){
//             if (str.isEmpty()) {
//                 System.out.println("Kosong");
//             } else {
//             return  reverseString(.substring(1))+str.charAt(0);

//             }

//         }

//         public static void main(String[] args) {
//             ReverseString rs = new ReverseString();
//             String resultantSting1 = rs.reverseString("Daspro");

//             System.out.println(resultantSting1);
//         }
//     }

public class tugasindiduteori {
    // recursive function to reverse a string
    public String reverseString(String str) {
        if (str.isEmpty()) {
            System.out.println("");
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        tugasindiduteori rs = new tugasindiduteori();
        String resultantSting1 = rs.reverseString("Dasar Pemrograman");
        System.out.println(resultantSting1);
    }
}