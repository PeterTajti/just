import java.util.*;

public class UniqueString {
    public static void main(String[] args) {

        String test = "anagram";
        System.out.println(uniqueLetters(test));
    }

    public static List<Character> uniqueLetters(String word) {

        List temp = new ArrayList<>();
        char value = 0;
        String str1[] = word.split(" ");

        for (int k = 0; k < str1.length; k++) {

            char string[] = str1[k].toLowerCase().toCharArray();

            for (int i = 0; i < string.length; i++) {
                int count = 0;
                for (int j = 0; j < string.length; j++) {
                    if (i != j) {
                        if (string[i] == string[j]) {
                            count++;
                        }
                    }
                }
                if (count == 0) {
                    temp.add(string[i]);
                }
            }
        }
        return temp;
    }
}