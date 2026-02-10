import java.io*;
import java.util.*;
UserMainCode{
class UserMainCode
{
    public int AddSub(int input1, int input2)
    {
        int N = input1;

        if (input2 == 1) {
            // Option 1
            return (N % 2 == 0) ? (N / 2) : (N / 2 + 1);
        } else {
            // Option 2
            return (N % 2 == 0) ? (3 * N / 2) : ((3 * N - 1) / 2);
        }
    }
}
}