import java.io*;
import java.util.*;
class UserMainCode{
public int addLastDigits(int input1, int input2) {
    int lastDigit1 = Math.abs(input1) % 10;
    int lastDigit2 = Math.abs(input2) % 10;
    return lastDigit1 + lastDigit2;
}}
