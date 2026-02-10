import java.io*;
import java.util.*;
class UserMainCode{
public int sumOfNonPrimeIndexValues(int[] input1, int input2) {

    int sum = 0;

    for (int i = 0; i < input2; i++) {
        if (!isPrime(i)) {   // index is NOT prime
            sum += input1[i];
        }
    }

    return sum;
}

// helper method to check prime index
private boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

}