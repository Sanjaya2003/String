package String.basic;

public class ReplaceChar {

	public static void main(String[] args) {
		String s="sanjaya123";
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char ch1=ch[i];
			if(ch1>='a'&&ch1>='z'||ch1>='A'&&ch1>='Z')
			{
				continue;
			}
			else
			{
				ch[i]='a';
			}
		}
		System.out.println(ch);
		
	}

}
