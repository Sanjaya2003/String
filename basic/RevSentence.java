package String.basic;

public class RevSentence {

	public static void main(String[] args) {
		String s="java is easy";
		String s1="";
		int i=s.length()-1;
		int j=s.length()-1;
		while(j>=0)
		{
			while(j>=0&&s.charAt(j)!=' ')
			{
				j--;
				
			}
			
			int k=j+1;
			String temp="";
			while(k<=i)
			{
				temp+=s.charAt(k);
				k++;
			}
			s1+=temp;
			if(j>0&&j<s.length()-1)
				s1+=" ";
			j--;
			i=j;
		}
		System.out.println(s1);

	}

}
