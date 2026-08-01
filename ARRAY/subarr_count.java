package ARRAY;
import java.util.*;
public class subarr_count {
    static int count(int x[],int k)
    {
        HashMap<Integer,Integer> p=new HashMap<>();
        p.put(0, 1);
        int psum=0,c=0;
        for(int i : x)
        {
            psum+=i;
            if(p.containsKey(psum-k))
            {
                c+=p.get(psum-k);
            }
            p.put(psum, p.getOrDefault(psum, 0)+1);
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int x[]=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print("\nEnter the value of k : ");
        int k=sc.nextInt();
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println("Numbers of subarray with sum  "+k+" : "+count(x, k));
        sc.close();
    }
}
