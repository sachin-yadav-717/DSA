package ARRAY;

import java.util.Scanner;

public class insertion_sort {
    static void insertion(int x[]) {
        System.out.print("Array Before sorting : ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = i; j > 0; j--) {
                if (x[j] < x[j - 1]) {
                    int t = x[j];
                    x[j] = x[j - 1];
                    x[j - 1] = t;
                }
                else{
                    break;
                }
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
        insertion(x);
        sc.close();
    }
}
