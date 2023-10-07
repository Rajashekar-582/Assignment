package corejava;

import java.util.Scanner;

public class Pangram {
	boolean m1(String s)
	{
		s=s.toLowerCase();
		boolean []b=new boolean[26];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if('a'<=ch&&'z'>=ch)
			{
				b[ch-'a']=true;
			}
		}
		for(boolean i:b)
		{
			if(!i)
			{
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Pangram p=new Pangram();
		String s=sc.nextLine();
		boolean flag= p.m1(s);
		if(flag)
		{
			System.out.println("It is a pangram");
		}
		else
			System.out.println("it is not pangram");

	}

}
/*output
the quick brown fox jumps over the lazy dog
It is a pangram
===========================================
This is a sunny day
it is not pangram
*/