import java.util.*;

public class N_to_1_backtrack {

    static Scanner sc=new Scanner(System.in);
    static void backt(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        backt(i+1, n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        System.out.print("Enter the limit : ");
        int n=sc.nextInt();
        backt(1, n);
    }
}