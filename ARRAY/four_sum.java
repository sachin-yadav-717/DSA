package ARRAY;
import java.util.*;
public class four_sum {
    static List<List<Integer>> foursum(int x[],int t)
    {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(x);
        for(int i=0;i<x.length-3;i++)
        {
            if(i>0 && x[i]==x[i-1])
            {
                continue;
            }
            for(int j=i+1;j<x.length-2;j++)
            {
                if(j!=i+1 && x[j]==x[j-1])
                {
                    continue;
                }
                int k=j+1,l=x.length-1;
                while(k<l)
                {
                    long s=(long)x[i]+x[j]+x[k]+x[l];
                    if(s>t)
                    {
                        l--;
                    }
                    else if(s<t)
                    {
                        k++;
                    }
                    else
                    {
                        list.add(Arrays.asList(x[i],x[j],x[k],x[l]));
                        k++;
                        l--;
                        while(k<l && x[k]==x[k-1])
                        {
                            k++;
                        }
                        while(k<l && x[l]==x[l+1])
                        {
                            l--;
                        }
                    }
                }
            }
        }
        return list;
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
        System.out.print("\nEnter the target : ");
        int t=sc.nextInt();
        System.out.println("List of All quadruplets sum = "+t+" : "+foursum(x,t));
        sc.close();
    }
}
