package String.basic;

public class IndexOfChar {

	public static void main(String[] args) {
		String s="jspiders";
		System.out.println(find(s,'s'));

	}
	public static int find(String s,char c)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(c==ch)
			{
				return i;
			}
		}
		return -1;
		
		
	}

}
