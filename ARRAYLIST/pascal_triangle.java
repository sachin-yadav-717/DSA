package ARRAYLIST;
import java.util.*;
class pascal_triangle {
    static List<List<Integer>> all(int n)
    {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            list.add(li(i));
        }
        return list;
    }
    static List<Integer> li(int r)
    {
        List<Integer> list=new ArrayList<>(r);
        int e=1;
        list.add(e);
        for(int i=1;i<r;i++)
            {
                e=(e*(r-i))/i;
                list.add(e);
            }
            return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Pascal's Triangle : ");
        int n=sc.nextInt();
        List<List<Integer>> list=all(n);
        System.out.println(list);
        sc.close();
    }
}