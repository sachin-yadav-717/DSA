package ARRAYLIST;

import java.util.*;

public class ROTATE
{
    static Scanner sc = new Scanner(System.in);

    static void rotate() {
        ArrayList<Integer> list = new ArrayList<>(100);
        System.out.print("Enter numbers of element : ");
        int k = sc.nextInt();
        System.out.println("Enter the list elements below ");
        while (k >= 1) {
            int n = sc.nextInt();
            list.add(n);
            k--;
        }
        System.out.println("Enter  position to rotate list :  ");
        int p=sc.nextInt();
        System.out.println("Original List : " + list);
        Collections.rotate(list, p);
        System.out.println("Rotated List : "+list);
    }
    public static void main(String[] args) {
        rotate();
    }
}
