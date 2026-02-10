import java.io*;
import java.util.*;
class UserMainCode{
public int mostFrequentlyOccurringDigit(int[] input1, int input2) {

    int[] freq = new int[10]; // frequency of digits 0-9

    // Count digit frequencies
    for (int i = 0; i < input2; i++) {
        int num = input1[i];

        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num = num / 10;
        }
    }

    int maxFreq = 0;
    int result = 0;

    // Find digit with highest frequency
    // If tie, choose the largest digit
    for (int d = 0; d <= 9; d++) {
        if (freq[d] > maxFreq || (freq[d] == maxFreq && d > result)) {
            maxFreq = freq[d];
            result = d;
        }
    }

    return result;
}

}