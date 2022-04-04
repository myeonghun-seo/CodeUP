import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    long a = sc.nextInt();
	    long m = sc.nextInt();
	    long b = sc.nextInt();
	    long n = sc.nextInt();
	    long sum = a;
	    
	    for(int i = 0; i < n; i++)
	    {
	        if(i == 0)continue;
	        sum = (sum * m) + b;
	    }
	    
		System.out.println(sum);
	}

}
