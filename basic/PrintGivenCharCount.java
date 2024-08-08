package String.basic;

public class PrintGivenCharCount {

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
			}
			
		}
		System.out.println(count);
		
	}

}
