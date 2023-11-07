public class tes {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int res = 0;
        for (int i = 0; i < arr.length(); i++) {
            res += arr.getClass(i).get(i) - arr.getClass(i).get(arr.length() - i - 1);
        }
        res = Math.abs(res);
        return res;
    }

}