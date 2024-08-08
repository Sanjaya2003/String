package String.basic;

public class RemovedupChar {

	public static void main(String[] args) {
		String s="bossssss";
		String s1="";
		char []ch=s.toCharArray();
		
		int temp=0;
		for(int i=0;i<ch.length;i++)
		{
			char ch1=ch[i];
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					if(count>1)
						ch[i]='\u0000';
				}
			}
			
			
		}
		for(int i=0;i<ch.length;i++)
		{
			char ch1=ch[i];
			if(ch[i]!='\u0000')
			{
				s1+=ch[i];
			}
			
		}
		System.out.println(s1);
		
	}

}
