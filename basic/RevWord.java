package String.basic;

public class RevWord {

	public static void main(String[] args) {
		String s="java is easy";
		String s1="";
		int len=s.length()-1;
		int i=0;
		int j=0;
		while(j<=len)
		{
			while(j<=len&&s.charAt(j)!=' ')
				j++;
			int k=j-1;
			String temp="";
			while(k>=i)
			{
				temp+=s.charAt(k);
				k--;
			}
			s1+=temp;
			if(j>0&&j<len)
				s1+=" ";
			j++;
			i=j;
		}
		System.out.print(s1);
	}

}
