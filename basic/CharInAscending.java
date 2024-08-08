package String.basic;

public class CharInAscending {

	public static void main(String[] args) {
		String s="sanjaya";
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=0;j<ch.length-1;j++)
			{
				if(ch[j+1]<ch[j])
				{
					char c=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=c;
				}
			}
		}
		System.out.println(ch);
	}

}
