import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
		System.out.println("enter number");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		if(a<0)
		System.out.println("negative");
		else if(a>0)
		System.out.println("positive");
		else
		System.out.println("zero");
		
	}

}