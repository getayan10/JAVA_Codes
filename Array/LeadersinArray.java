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
		int max=arr[n-1];
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(max);
		for(int i=n-2;i>=0;i--)
		{
		    if(max<=arr[i])
		    {
		        max=arr[i];
		        list.add(max);
		    }
		}
		Collections.reverse(list);
		System.out.println(list);
	}
}
