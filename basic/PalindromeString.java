package String.basic;

public class PalindromeString {

	public static void main(String[] args) {
		String s="abba";
		int i=0;
		int j=s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				System.out.println(s+" is not a palindrome");
				break;
			}
			else
			{
				i++;
				j--;
			}
		}
		if(i>j)
		System.out.println(s+" is a palindrome");

	}

}
