import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.lang.Math;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int res = 0;
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            res += arr.get(i).get(i) - arr.get(i).get(arr.size() - i - 1);
        }
        res = Math.abs(res);
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());
        arr.get(0).add(11);
        arr.get(0).add(2);
        arr.get(0).add(3);
        arr.get(1).add(4);
        arr.get(1).add(5);
        arr.get(1).add(6);
        arr.get(2).add(10);
        arr.get(2).add(8);
        arr.get(2).add(12);

        System.out.println(diagonalDifference(arr));
    }
}
