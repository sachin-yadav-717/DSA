package ARRAY;

import java.util.*;

public class intersection {
    static void inter(int x[], int y[]) {
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < x.length && j < y.length) {
            if (x[i] == y[j]) {
                list.add(x[i]);
                i++;
                j++;
            } else if (x[i] < y[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("Insertion of 2 array : " + list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size of 1st : ");
        int n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("Enter the array elements of 1st : ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        System.out.print("1st Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the array size of 2nd : ");
        int m = sc.nextInt();
        int y[] = new int[m];
        System.out.println("Enter the array elements of 2nd : ");
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }
        System.out.print("2nd Array : ");
        for (int i = 0; i < m; i++) {
            System.out.print(y[i] + " ");
        }
        System.out.println();
        inter(x, y);
        sc.close();
    }
}
