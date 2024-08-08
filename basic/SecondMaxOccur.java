package String.basic;

public class SecondMaxOccur {

	public static void main(String[] args) {
		String s="abbfgggvvywwww";
		int maxcount=0;
		char maxchar=' ';
		int secmaxcount=0;
		char secmaxchar=' ';
		while(s.length()!=0)
		{
			char c=s.charAt(0);
			String s1=s.replace(c+"", "");
			int count=s.length()-s1.length();
			
			if(maxcount<count)
			{
				
					secmaxcount=maxcount;
					maxcount=count;
					secmaxchar=maxchar;
					maxchar=c;
				
				
			}
			else if(secmaxcount<count)
			{
				if((secmaxcount<maxcount))
				{
					secmaxcount=count;
					secmaxchar=c;
				}
			}
			
			s=s1;
		}
		System.out.println(secmaxchar);

	}

}
