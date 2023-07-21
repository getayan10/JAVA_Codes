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
		int res=1;
		int curr=1;
		for(int i=1;i<n;i++)
		{
		    if((arr[i]%2==0)&&(arr[i-1]%2==1)||(arr[i-1]%2==0)&&(arr[i]%2==1))
		    {
		        curr++;
		        res=Math.max(res,curr);
		    }
		}
		System.out.println(res);
	}
}
