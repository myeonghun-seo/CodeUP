import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int sum = 0;
	    
	    for(int i = 0; i < a + 1; i++){
	        if(i % 2 == 0)
	        {
	            sum += i;
	        }
	        
	    }
	    
	    System.out.println(sum);
	    
	}

}
