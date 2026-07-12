package ARRAY;

import java.util.Scanner;

public class bubble_sort {
    static void selection(int x[]) {
        System.out.print("Array Before sorting : ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        for (int i = 0; i < x.length - 1; i++) {
            int f=0;
            for (int j = 0; j < x.length - i - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int t = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = t;
                    f=1;
                }
            }
            if(f==0)
            {
                break;
            }
        }
        System.out.print("\nArray after sorting : ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("Enter the array elements below ");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        selection(x);
        sc.close();
    }
}
