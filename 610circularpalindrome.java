import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'circularPalindromes' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING s as parameter.
     */

    public static List<Integer> circularPalindromes(String s) {

    int n = s.length();
    String doubled = s + s;
    List<Integer> result = new ArrayList<>();

    for (int start = 0; start < n; start++) {
        int end = start + n;
        int maxLen = 1;

        for (int center = start; center < end; center++) {

            // Odd length palindromes
            int left = center;
            int right = center;

            while (left >= start && right < end &&
                    doubled.charAt(left) == doubled.charAt(right)) {
                maxLen = Math.max(maxLen, right - left + 1);
                left--;
                right++;
            }

            // Even length palindromes
            left = center;
            right = center + 1;

            while (left >= start && right < end &&
                    doubled.charAt(left) == doubled.charAt(right)) {
                maxLen = Math.max(maxLen, right - left + 1);
                left--;
                right++;
            }
        }

        result.add(maxLen);
    }

    return result;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        List<Integer> result = Result.circularPalindromes(s);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
