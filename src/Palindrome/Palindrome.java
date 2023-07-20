package Palindrome;
import java.util.*;

public class Palindrome {
	
	public static int palindrome(String s,int start,int end)
	{
		char[] arr = s.toCharArray();
		if(arr[start] != arr[end])
		{
			return 0;
		}
		if(start > end)
		{
			return 1;
		}
		return palindrome(s,start+1,end-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int start = scan.nextInt();
		int end = scan.nextInt();
		System.out.println(palindrome(s,start,end));
	}

}
