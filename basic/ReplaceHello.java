package String.basic;

public class ReplaceHello {

	public static void main(String[] args) {
		String s="hello world";
		String s1=s;
		int lcount=0;
		int ocount=0;
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char c=ch[i];
			
			if(c=='l')
			{
				lcount+=1;
//				System.out.println(lcount);
				char chared=(char) ((char) lcount+'0');
//				System.out.println(chared);
				ch[i]=chared;
			}
			else if(c=='o')
			{
				ocount+=1;
//				System.out.println(ocount);
				char charedo=(char) ((char) ocount+'0');
//				System.out.println(charedo);
				ch[i]=charedo;
			}
			else
				continue;
		}
		System.out.println(ch);

	}

}
