import java.util.*;

public class n_th_fibonacci {
    static int fibo(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the position to find its fibonacci : ");
        int n=sc.nextInt();
        System.out.println(n+"-th Fibonacci : "+fibo(n));
        sc.close();
    }
}
