package ARRAY;
import java.util.*;
public class three_sum {
    static List<List<Integer>> threesum(int x[])
    {
        List<List<Integer>> tri=new ArrayList<>();
        Arrays.sort(x);
        for(int i=0;i<x.length-2;i++)
        {
            if(i>0 && x[i]==x[i-1]) continue;
            int j=i+1,k=x.length-1;
            while(j<k)
            {
                int s=x[i]+x[j]+x[k];
                if(s>0)
                {
                    k--;
                }
                else if(s<0)
                {
                    j++;
                }
                else
                {
                    tri.add(Arrays.asList(x[i],x[j],x[k]));
                    j++;
                    k--;
                    while(j<k && x[j]==x[j-1])
                    {
                        j++;
                    }
                    while(j<k && x[k]==x[k+1])
                    {
                        k--;
                    }
                }
            }
        }
        return tri;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entre the size of the array : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Entre the array elements ");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println("\nList of All triplets sum = '0' : "+threesum(x));
        sc.close();
    }
}
