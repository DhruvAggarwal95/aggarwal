
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			char a;
		System.out.println("enter the alphabet");
		Scanner s= new Scanner (System.in);
		a=s.next().charAt(0);
		if(a>='a'&& a<='z'||a>='A'&& a<='Z')
		System.out.println("Its an alphabet");
		else
		System.out.println("not an alphabet");