import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int sum = 0;
	    int i = 0;
	    
	    while(true)
	    {
	        sum += i;
	        
	        if(sum >= a)break;
	        
	        i++;
	    }
	    
	    System.out.println(i);
	    
	}

}
