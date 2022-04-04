import java.io.*;
import java.util.*;

public class Main 
{
    // 시간초과가 나오기 때문에 BufferedReader를 사용할 줄 알아야 한다.
	public static void main(String[] args)
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
		try 
		{
			
			String[] n = br.readLine().split(" ");
			int count = 0;
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			for (int i = 0; i < Integer.valueOf(n[0]); i++) 
			{
			
				for (int j = 0; j < Integer.valueOf(n[1]); j++) 
				{
			
					for (int k = 0; k < Integer.valueOf(n[2]); k++) 
					{
					
						bw.write(i + " " + j + " " + k + "\n");
						count++;
					
					    
					}
					
				}
				
			}
			
			bw.write(String.valueOf(count));
			bw.flush();
		
		    
		} 
		
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}//end of main()
}
