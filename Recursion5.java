//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Recursion5 {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk" + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk" + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {

        int n =2;
        towerOfHanoi(n,"S","H","D");

        }
    }
