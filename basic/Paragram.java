package String.basic;

public class Paragram {

	public static void main(String[] args) {
		String s="a quick brown fox jumps over the lazy dog";
		String s1="abcdefghijklmnopqrstuvwxyz";
		int count=0;
		if(s.length()<26)
		{
			System.out.println(s+" is not paragram");
		}
		else {
			for(int i=0;i<s1.length();i++)
			{
				char ch=s1.charAt(i);
				if(s.indexOf(ch)==-1)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(s+" is  paragram");
			}
			else
			{
				System.out.println(s+" is not paragram");
			}
		}
		

	}

}
