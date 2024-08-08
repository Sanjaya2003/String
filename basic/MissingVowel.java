package String.basic;

public class MissingVowel {

	public static void main(String[] args) {
		String s="javadeveloper";
		String s1="aeiou";
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
