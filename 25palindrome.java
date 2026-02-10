import java.io.*;
import  java.util.*;
public class UserMainCode {
    public int ispalindrome(String input1) {
        // Convert to lowercase for case-insensitive comparison
        int left = 0;
        int right = input1.length() - 1;

        while (left < right)
        {
            if (Character.toLowerCase(input1.charAt(left)) !=
                Character.toLowerCase(input1.charAt(right)))
            {
                return 1; // NOT a palindrome
            }
            left++;
            right--;
        }

        return 2;  // Is palindrome (expected output for "MADam")
    }
}
