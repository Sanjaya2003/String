package String.basic;

public class CountOccurance {

	public static void main(String[] args) {
		String s="aaabbcccc";
		while(s.length()!=0)
		{
			int count;
			char ch=s.charAt(0);
			String s1=s.replace(ch+"","");
			count=s.length()-s1.length();
			System.out.println(ch+" count is "+count);
			s=s1;
		}
	}
	
}
