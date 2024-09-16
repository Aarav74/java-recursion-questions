import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashSet;
public class Recursion11 {
    public static void subsequences(String str, int idx, String newString, HashSet<String>set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        subsequences(str, idx + 1, newString + currChar, set);

        subsequences(str, idx + 1, newString, set);
    }


    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0 ,"", set);

        }
    }