package stringArray;

import java.util.*;
public class String {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char[] stringArray = creatArray();
		showchar(stringArray);
		int[] countchar=count(stringArray);
		showcount(countchar);

	}
	public static void showcount(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" "+(char)(i+'a'));
			if((i+1)%10==0)System.out.println();
		}
	}
	public static int[] count(char[] a) {
		int[] count=new int[26];
		for(int i=0;i<=a.length;i++) {
			count[a[i]-'a']++;
		}
		return count;
	}

	public static void showchar(char[] a) {
		for (int i = 0; i <= a.length; i++) {
			System.out.print(a[i] + ", ");
			if((i+1)%10==0)System.out.println();
		}
		System.out.println();System.out.println();System.out.println();

	}

	public static char[] creatArray() {
		char[] chars = new char[20];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char) (Math.random() * 26 + 97);

		}
		return chars;
	}
}


