import java.io.*;
import  java.util.*;
public class UserMainCode {
    public int totalHillWeight(int input1, int input2, int input3) {

    int totalWeight = 0;
    int currentWeight = input2;

    for (int level = 1; level <= input1; level++) {
        totalWeight += level * currentWeight;
        currentWeight += input3;
    }

    return totalWeight;
}

}
