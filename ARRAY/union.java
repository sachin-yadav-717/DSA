package ARRAY;

import java.util.*;

public class union {
    static void uni(int x[], int y[]) {
        int i = 0, j = 0,k=0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < x.length && j < y.length) {
            if (x[i] < y[j]) {
                k=x[i++];
            } else if (y[j] < x[i]) {
                k=y[j++];
            } else {
                k=x[i++];
                j++;
            }
            if(list.isEmpty()||list.get(list.size()-1)!=k)
            {
                list.add(k);
            }
        }
        while (i < x.length) {
            if(list.isEmpty()||list.get(list.size()-1)!=x[i])
            {
                list.add(x[i]);
            }
            i++;
        }
        while (j < y.length) {
            if(list.isEmpty()||list.get(list.size()-1)!=y[j])
            {
                list.add(y[j]);
            }
            j++;
        }
        System.out.print("Union of array : ");
        for (i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
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
        uni(x, y);
        sc.close();
    }
}
