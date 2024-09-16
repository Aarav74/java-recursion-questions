
public class Recursion15 {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int verticalPlacements = placeTiles(n - m, m);

        int horPlacements = placeTiles(n - 1, m);

        return verticalPlacements + horPlacements;
    }


    public static void main(String[] args) {
        int n=4, m=2;
        System.out.println(placeTiles(n,m));

        }
    }
