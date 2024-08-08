package String.basic;

public class CountWords {
	public static void main(String [] args)
	{
		String s="java is easy a";
		int j=0;
		int count=0;
		while(j<=s.length())
		{
			while(j<s.length()&&s.charAt(j)!=' ')
			{
				j++;
			}
			if(s.charAt(j-1)!=' ')
			{
				count++;
			}
			j++;
		}
			
		
		System.out.println(count);
	}

}
