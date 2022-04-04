import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    long a = sc.nextInt();
	    long b = sc.nextInt();
	    long n = sc.nextInt();
	    long sum = a;
	    
	    for(int i = 0; i < n; i++)
	    {
	        if(i == 1)continue;
	        sum *= b;
	    }
	    
		System.out.println(sum);
	}

}
