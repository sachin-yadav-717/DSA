package ARRAY;
import java.util.*;

public class first_last_post {

    static int firstIndex(int x[], int t) {
        int low = 0, high = x.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x[mid] == t) {
                ans = mid;
                high = mid - 1;      // search left
            } else if (x[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    static int lastIndex(int x[], int t) {
        int low = 0, high = x.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x[mid] == t) {
                ans = mid;
                low = mid + 1;       // search right
            } else if (x[mid] < t) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    static int[] sr(int x[], int t) {
        int p[] = {-1, -1};

        p[0] = firstIndex(x, t);

        if (p[0] == -1)
            return p;

        p[1] = lastIndex(x, t);

        return p;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();

        int x[] = new int[n];

        System.out.println("Enter the sorted array elements");

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        System.out.print("Enter Target : ");
        int t = sc.nextInt();

        int p[] = sr(x, t);

        System.out.println("First Index : " + p[0]);
        System.out.println("Last Index  : " + p[1]);

        sc.close();
    }
}