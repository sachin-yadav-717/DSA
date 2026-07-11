package ARRAY;

import java.util.HashMap;
import java.util.Scanner;

public class frequency_hashmap {
    static Scanner sc=new Scanner(System.in);
    static void freq(HashMap<Integer,Integer>fre)
    {
        int f=0;
        while(f==0)
        {
            System.out.print("Enter the number to search it frequency : ");
            int n=sc.nextInt();
            System.out.println(n+" appears : "+fre.getOrDefault(n,0)+" times\n");
            System.out.print("Enter '1' to exit searching else '0' :");
            f=sc.nextInt();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        HashMap<Integer ,Integer> fre=new HashMap<>();
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the elements below ");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            fre.put(x[i],fre.getOrDefault(x[i],0 )+1);
        }
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
        freq(fre);
    }
}
