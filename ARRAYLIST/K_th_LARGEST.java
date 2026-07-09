package ARRAYLIST;
import java.util.*;
public class K_th_LARGEST {
    static Scanner sc=new Scanner(System.in);
    static void k_th()
    {
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
        Collections.sort(list);
        System.out.println("Sorted List : "+list);
        System.out.println("Enter the k-th value : ");
        int p=sc.nextInt();
        int e=list.get(list.size()-p);
        System.out.println("The "+p+"th largest element : "+e);
    }
    public static void main(String[] args) {
        k_th();
    }
}
