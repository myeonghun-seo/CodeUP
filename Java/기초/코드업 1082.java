import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt(16);
	    
	    for(int i = 1; i < 16; i++)
	        
	        System.out.printf("%X*%X=%X\n", a, i, a*i);
	    
	}

}
