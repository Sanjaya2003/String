package String.basic;

public class CountChar {

	public static void main(String[] args) {
		String s="SanjayaKumarBhutia1234";
		int uc=0,lc=0,num=0,sp=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
			}
			else if(ch>='a'&&ch<='z')
			{
				lc++;
			}
			else if(ch>='0'&&ch<='9')
			{
				num++;
			}
			else
				sp++;
		}
		System.out.println("In "+s+" their are "+uc+" upper case later "+lc+" lower case later "+num+" numbers and "+sp+" special character is present");

	}

}
