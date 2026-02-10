import java.io*;
import java.util.*;
clas UserMainCode{
public int countPrimesInRange(int input1, int input2) {
    int count = 0;

    for (int num = input1; num <= input2; num++) {
        if (num < 2) {
            continue;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            count++;
        }
    }

    return count;
}

}
