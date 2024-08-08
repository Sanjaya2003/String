package String.basic;

public class MaxlengthPalindrome {

	public static void main(String[] args) {
		String s="malayalam";
		String s2="";
		int maxcount=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+3;j<=s.length();j++)
			{
				String s1=s.substring(i,j);
				
				if(palindrome(s1))
				{
					int count=s1.length();
					
					if(count>maxcount)
					{
						maxcount=count;
						s2=s1;
					}
						
				}
					
			}
		}
		System.out.println(s2);
	}
	public static boolean palindrome(String s)
	{
		int a=0;
		int b=s.length()-1;
		while(a<=b)
		{
			if(s.charAt(a)!=s.charAt(b))
			{
				return false;
			}
			a++;
			b--;
		}
		return true;
	}

}
