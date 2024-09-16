

public class Recursion10 {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str, int idx, String newString) {
        if( idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {

            removeDuplicate(str, idx + 1, newString);



        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newString);
        }
    }
    public static void main(String[] args) {
            String str = "abbccdaa";
            removeDuplicate(str, 0, "");



        }
    }
