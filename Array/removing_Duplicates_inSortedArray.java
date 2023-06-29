/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int r=0;
		for(int i=1;i<n;i++)
		{
		    if(arr[i]!=arr[r])
		    {
		        arr[r+1]=arr[i];
		        r++;
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.println(arr[i]);
		}
		
	}
}
