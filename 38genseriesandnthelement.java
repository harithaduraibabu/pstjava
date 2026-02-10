import java.io,*;
import java.util.*;
class usermaincode
public int seriesN(int input1, int input2, int input3, int input4) {

    int a = input1;
    int b = input2;
    int c = input3;
    int N = input4;

    // If N is within first 3 elements
    if (N == 1) return a;
    if (N == 2) return b;
    if (N == 3) return c;

    int gap1 = b - a;
    int gap2 = c - b;

    int current = c;

    for (int i = 4; i <= N; i++) {
        if ((i - 4) % 2 == 0) {
            current += gap1;
        } else {
            current += gap2;
        }
    }

    return current;
}
