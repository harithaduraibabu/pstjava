import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static PerformOperation isOdd() {
        return new PerformOperation() {
            public boolean check(int a) {
                return a % 2 != 0;
            }
        };
    }

    public static PerformOperation isPrime() {
        return new PerformOperation() {
            public boolean check(int a) {
                if (a <= 1) return false;
                for (int i = 2; i * i <= a; i++) {
                    if (a % i == 0) return false;
                }
                return true;
            }
        };
    }

    public static PerformOperation isPalindrome() {
        return new PerformOperation() {
            public boolean check(int a) {
                int temp = a;
                int rev = 0;

                while (temp > 0) {
                    rev = rev * 10 + temp % 10;
                    temp /= 10;
                }
                return rev == a;
            }
        };
    }

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }
}

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyMath ob = new MyMath();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            int ch = Integer.parseInt(input[0]);
            int num = Integer.parseInt(input[1]);

            PerformOperation op;
            boolean result;

            if (ch == 1) {
                op = ob.isOdd();
                result = ob.checker(op, num);
                System.out.println(result ? "ODD" : "EVEN");
            } 
            else if (ch == 2) {
                op = ob.isPrime();
                result = ob.checker(op, num);
                System.out.println(result ? "PRIME" : "COMPOSITE");
            } 
            else if (ch == 3) {
                op = ob.isPalindrome();
                result = ob.checker(op, num);
                System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }
}
