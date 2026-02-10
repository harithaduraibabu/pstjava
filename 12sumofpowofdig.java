import java.io*;
import java.util.*;
class UserMainCode{
public int sumOfPowerOfDigits(int input1) {
    int sum = 0;
    String num = String.valueOf(Math.abs(input1));

    for (int i = 0; i < num.length(); i++) {
        int digit = num.charAt(i) - '0';
        int power;

        if (i == num.length() - 1) {
            power = 0; // right-most digit
        } else {
            power = num.charAt(i + 1) - '0';
        }

        sum += Math.pow(digit, power);
    }

    return sum;
}

}