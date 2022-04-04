import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int result = 0;
	    
        if(a<=b) result = 1;
	    
		System.out.println(result);
	}

}
