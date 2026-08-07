package ARRAY;
import java.util.*;
public class Num_subarr_xor_k {
    static void count(int x[],int k)
    {
        int xor=0,c=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<x.length;i++)
        {
            xor^=x[i];
            if(map.containsKey(xor^k))
            {
                c+=map.get(xor^k);
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        System.out.println("\nNumber of subarray with xor "+k+" : "+c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the array elements below 🦴");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("Entre the value of 'K' : ");
        int k=sc.nextInt();
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        count(x, k);
        sc.close();
    }
}
