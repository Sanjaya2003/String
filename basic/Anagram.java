package String.basic;

public class Anagram {

	public static void main(String[] args) {
		String s1="keep";
		String s2="peek";
		if(anagram(s1,s2))
		{
			System.out.println(s1+" and "+s2+" are anagram string");
		}
		else
			System.out.println(s1+" and "+s2+" are not anagram string");

	}
	public static boolean anagram(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			while(s1.length()!=0)
			{
				char ch=s1.charAt(0);
				if(s1.length()==0)
				{
					break;
				}
				else
				{
					s1=s1.replace(ch+"","");
					s2=s2.replace(ch+"", "");
				}
				
			}
			if(s1==s2)
				return true;
				
		}
		
			return false;
		
		
	}

}
