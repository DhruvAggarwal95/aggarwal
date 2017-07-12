import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a;
		System.out.println("enter the year");
		Scanner s= new Scanner (System.in);
		a=s.nextInt();
		if(a%4==0)
		System.out.println("the entered year is leap year");
		else
		System.out.println("not a leap year");