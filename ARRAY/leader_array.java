package ARRAY;
import java.util.*;
public class leader_array {
    static void leader(int x[])
    {
        ArrayList<Integer> lead=new ArrayList<>();
        int l=x[x.length-1];
        lead.add(l);
        for(int i=x.length-2;i>=0;i--)
        {
            if(x[i]>l)
            {
                l=x[i];
                lead.add(l);
            }
        }
        System.out.println("\nLeaders : "+lead);
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
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        leader(x);
        sc.close();
    }
}