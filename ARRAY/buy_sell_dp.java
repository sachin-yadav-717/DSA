package ARRAY;

import java.util.*;

public class buy_sell_dp {
    static void bsstock(int x[]) {
        int minPrice = x[0];
        int minDay = 0, maxProfit = 0, buyDay = 0, sellDay = 0;
        for (int i = 1; i < x.length; i++) {
            if (x[i] - minPrice > maxProfit) {
                maxProfit = x[i] - minPrice;
                buyDay = minDay;
                sellDay = i;
            }

            if (x[i] < minPrice) {
                minPrice = x[i];
                minDay = i;
            }
        }
        System.out.println("Max profit : " + maxProfit);
        if (maxProfit > 0) {
            System.out.println("Buy Day : " + (buyDay + 1));
            System.out.println("Sell Day: " + (sellDay + 1));
        } else {
            System.out.println("No profitable transaction possible.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("\nEnter the array elements below");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        System.out.print("\nArray : ");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
        bsstock(x);
        sc.close();
    }
}
