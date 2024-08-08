package String.basic;

public class MissingAlphabte {

	public static void main(String[] args) {
		String s="javadeveloper";
		String s1="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(s.indexOf(ch)==-1)
			{
				System.out.println(ch);
			}
		}

	}

}
