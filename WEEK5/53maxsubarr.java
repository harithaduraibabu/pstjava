import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

  public static List<Integer> maxSubarray(List<Integer> arr) {

    int n = arr.size();
    
    // -------- Maximum Subarray (Kadane's Algorithm) --------
    int maxCurrent = arr.get(0);
    int maxGlobal = arr.get(0);

    for (int i = 1; i < n; i++) {
        maxCurrent = Math.max(arr.get(i), maxCurrent + arr.get(i));
        maxGlobal = Math.max(maxGlobal, maxCurrent);
    }

    // -------- Maximum Subsequence --------
    int subsequenceSum = 0;
    int maxElement = arr.get(0);

    for (int num : arr) {
        if (num > 0) {
            subsequenceSum += num;
        }
        maxElement = Math.max(maxElement, num);
    }

    // If all numbers are negative
    if (subsequenceSum == 0) {
        subsequenceSum = maxElement;
    }

    List<Integer> result = new ArrayList<>();
    result.add(maxGlobal);
    result.add(subsequenceSum);

    return result;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            List<Integer> result = Result.maxSubarray(arr);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
