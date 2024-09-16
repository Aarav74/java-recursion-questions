//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Recursion6 {
    public static void revNumber(int idx, String str) {
        if (idx  == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));

        revNumber(idx - 1, str);
    }


    public static void main(String[] args) {
        String str = "Aarav";
        revNumber(str.length()-1, str);

        }
    }
