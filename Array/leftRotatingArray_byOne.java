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
		int temp=arr[0];
		for(int i=0;i<n-1;i++)
		arr[i]=arr[i+1];
		arr[n-1]=temp;
		for(int i=0;i<n;i++)
		{
		    System.out.println(arr[i]);
		}
		
	}
}
