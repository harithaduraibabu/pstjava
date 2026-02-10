import java.io.*;
import  java.util.*;
public class UserMainCode {
    public int sumOfSumsOfDigits(int input1) {

    String num = Integer.toString(input1);
    int result = 0;

    for (int i = 0; i < num.length(); i++) {
        int sum = 0;
        for (int j = i; j < num.length(); j++) {
            sum += num.charAt(j) - '0';
        }
        result += sum;
    }

    return result;
}

}
