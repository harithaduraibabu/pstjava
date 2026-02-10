import java.io.*;
import java.util.*;
class solution{
public int NthPrime(int input1) {

    int count = 0;
    int num = 1;

    while (count < input1) {
        num++;
        if (isPrime(num)) {
            count++;
        }
    }

    return num;
}

// Helper method to check prime
private boolean isPrime(int n) {
    if (n < 2) return false;

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}
}