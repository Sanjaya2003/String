package String.basic;

public class ReplaceVowel {

	public static void main(String[] args) {
		String s="sanjayakumarbhutiaok";
		char []ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			char ch1=ch[i];
			if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
			{
				count++;
				if(count>3)
					ch[i]=' ';
			}
			
		}
		System.out.println(ch);
		
	}

}
