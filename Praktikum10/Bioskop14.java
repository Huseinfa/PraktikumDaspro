public class Bioskop14 {
    public static void main(String[] args) {
        
    String[][] penonton = new String[4][2];

    penonton[0][0] = "Amin";
    penonton[0][1] = "Bena";
    penonton[1][0] = "Candra";
    penonton[1][1] = "Dela";
    penonton[2][0] = "Eka";
    penonton[2][1] = "Farhan";
    penonton[3][0] = "Gisel";
    penonton[3][1] = "Hana";

    // System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
    // System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
    // System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
    // System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);
    // for (int i = 0; i < penonton.length; i++) {
    //     System.out.println("Panjang baris ke- " + (i+1) + ": " + penonton[i].length);
    // }
    // for (int i = 0; i <= 2; i++) {
    //     if (i == 2) {
    //     System.out.println("Penonton di baris ke-" + (i+1) + ": " + penonton[i][0] + " dan " + penonton[i][1]);

    //     }        
    // }

    // int barisKe= 1;
    // for (String[] barisPenonton : penonton) {

    //     System.out.println("Penonton di baris ke "+ barisKe + " adalah " + barisPenonton[0] + " dan " + barisPenonton[1]);
    //     barisKe++;
        
    // }

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
        }
    }
}
