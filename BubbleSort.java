import java.util.*;
import java.lang.*;
import java.io.*;

class BubbleSort
{
	static void bubbleSort(int a[]){
		int n=a.length;
		int flag=0;
		for(int i=n;i>=1;i--){
			flag=0;
			for(int j=0;j<i-1;j++){
				if(a[j]>a[j+1]){
					flag=1;
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
			if(flag==0)break;
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int a[]={2,8,4,5,6,7,3,1,9};
		bubbleSort(a);
		for(int k:a)System.out.print(k+" ");
		// your code goes here
	}
}
