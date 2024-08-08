package String.basic;

public class ReplaceBoss {

	public static void main(String[] args) {
		String s="bossssss";
		char []ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			char ch1=ch[i];
			if(ch1=='s')
			{
				count++;
				if(count%2==0)
					ch[i]='$';
			}
			
		}
		System.out.println(ch);
		
	}

}
