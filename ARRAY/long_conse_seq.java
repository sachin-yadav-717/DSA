package ARRAY;
import java.util.*;
public class long_conse_seq {
    static int LCS(HashSet<Integer> set)
    {
        if(set.isEmpty())
        {
            return 0;
        }
        int l=1,c=1,x=0;
        for(int i : set)
        {
            if(!set.contains(i-1))
            {
                c=1;
                x=i;
                while(set.contains(x+1))
                {
                    c++;
                    x++;;
                }
            }
            l=Math.max(l, c);
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("Enter the array elements below ");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
            set.add(x[i]);
        }
        System.out.println("Set : "+set);
        // for(int i : set)
        // {
        //     System.out.print(i+" ");
        // }
        System.out.println("Longest Consecutive Sequence : "+LCS(set));
        sc.close();
    }
}
