//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Recursion8 {
    public static boolean sortedArray(int idx, int arr[]) {
        if (idx == arr.length - 1) {
            return true;
        }


        if (arr[idx] < arr[idx + 1]) {
            return sortedArray(idx+1, arr);

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(sortedArray(0, arr));

        }
    }
