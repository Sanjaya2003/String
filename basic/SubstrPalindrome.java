package String.basic;

public class SubstrPalindrome {

	public static void main(String[] args) {
		String s="malayalam";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+3;j<=s.length();j++)
			{
				String s1=s.substring(i,j);
				if(palindrome(s1))
					System.out.println(s1);
			}
		}

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
