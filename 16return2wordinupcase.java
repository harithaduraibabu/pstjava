import java.io*;
import java.util.*;
class UserMainCode{
public String secondWordUpperCase(String input1) {

    if (input1 == null) {
        return "LESS";
    }

    String[] words = input1.trim().split("\\s+");

    if (words.length < 2) {
        return "LESS";
    }

    return words[1].toUpperCase();
}

}