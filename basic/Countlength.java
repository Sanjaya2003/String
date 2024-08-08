package String.basic;

public class Countlength {

	public static void main(String[] args) {
		String s="jspiders";
		int length=0;
		char []ch=s.toCharArray();
		for(char c:ch)
		{
			length++;
		}
		System.out.println(length);
	}

}
