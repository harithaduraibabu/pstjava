import java.util.*;
import java.lang.*;
import java.io.*;



class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // number of test cases
        
        while (T-- > 0) {
            String s = sc.next();
            int n = s.length();
            
            int[] leftFreq = new int[26];
            int[] rightFreq = new int[26];
            
            int mid = n / 2;
            
            // Count frequency for left half
            for (int i = 0; i < mid; i++) {
                leftFreq[s.charAt(i) - 'a']++;
            }
            
            // Start index for right half
            int start;
            if (n % 2 == 0) {
                start = mid;
            } else {
                start = mid + 1; // skip middle character
            }
            
            // Count frequency for right half
            for (int i = start; i < n; i++) {
                rightFreq[s.charAt(i) - 'a']++;
            }
            
            // Compare frequencies
            boolean isLapindrome = true;
            for (int i = 0; i < 26; i++) {
                if (leftFreq[i] != rightFreq[i]) {
                    isLapindrome = false;
                    break;
                }
            }
            
            if (isLapindrome) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}

