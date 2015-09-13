package myProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Project {

	public static void main(String[] x)
	{
	int[] a=new int[3];
	//a[0]=1;
	a[1]=2;
	a[2]=3;
	//a[3]=4;
	System.out.println("the lenght of array is :"+a.length);
	System.out.println("without storing the value :"+a[0]);
	System.out.println("the stored value is :"+a[1]);
	System.out.println("the hexa decimal address is :"+a);

	String s[]={"sha","hee","na"};
	System.out.println("the string array value is :"+s);
	System.out.println("the lenght of string is "+ s.length);
	System.out.println("the string is :"+ s[0]+s[1]+s[2]);
	
	String p="prakash";
	System.out.println("the value is :"+p);
	System.out.println("the length is :"+p.length());

	int k[]=new int[6];
	for(int i=0;i<=5;i++)
		{
		
		System.out.println("the value is :"+k[i] );
		}
	int []ps={30,20,10};
	for(int sp=0;sp<=2;sp++)
		{
		System.out.println("the string value is:"+ps[sp]);
		}

	}
	}


