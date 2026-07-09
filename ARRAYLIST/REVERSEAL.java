package ARRAYLIST;

import java.util.*;

public class REVERSEAL {

    static Scanner sc = new Scanner(System.in);

    static void AL() {
        ArrayList<Integer> list = new ArrayList<>(100);
        System.out.print("Enter numbers of element : ");
        int k = sc.nextInt();
        System.out.println("Enter the list elements below ");
        while (k >= 1) {
            int n = sc.nextInt();
            list.add(n);
            k--;
        }
        System.out.println("Original List : " + list);
        for (int i = 0; i < list.size() / 2; i++) {
            int t = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, t);
        }
        System.out.println("Reversed List : " + list);
    }

    public static void main(String[] args) {
        AL();
    }
}
