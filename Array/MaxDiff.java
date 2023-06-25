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
		int res=arr[1]-arr[0];
		int min=arr[0];
		for(int i=1;i<n;i++)
		{
		    res=Math.max(res,arr[i]-min);
		    min=Math.min(min,arr[i]);
		}
		System.out.println(res);
	}
}
