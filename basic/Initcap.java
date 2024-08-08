package String.basic;

public class Initcap {

	public static void main(String[] args) {
		String s="java is easy";
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char c=ch[i];
			if(c>='a'&&c<='z'&&(i==0||ch[i-1]==' '))
			{
				ch[i]=(char) (c-32);
			}
		}
		System.out.println(ch);
	}

}
