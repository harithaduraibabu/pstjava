import java.io.*;
import  java.util.*;
public class UserMainCode {
    public int allDigitsCount(int input1)
    {
        int count = 0;

        while (input1 > 0)
        {
            count++;
            input1 = input1 / 10;
        }

        return count;
    }
}
