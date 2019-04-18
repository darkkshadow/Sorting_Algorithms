import java.util.*;
import java.lang.*;
import java.io.*;

class RadixSort
{
	static void radixsort(int a[]){
		int max=a[0];
		for(int k:a)
			if(k>max)max=k;
		
		int n=a.length;
		for(int expo=1;max/expo > 0;expo*=10){
			countsort(a,expo);
		}
	}
	
	static void countsort(int a[],int expo){
		Node pos[]=new Node[10];
		//Arrays.fill(pos,null);
		int n=a.length;
		for(int i=0;i<n;i++){
			int index=(a[i]/expo)%10;
			if(pos[index]==null){
				pos[index]=new Node(a[i]);
			}
			else{
				Node p=new Node(a[i]);
				pos[index].next=p;
				p.prev=pos[index];
				pos[index]=p;
			}
		}
		
		for(int i=9,m=n-1;i>=0;i--){
			while(pos[i]!=null){
				a[m--]=pos[i].data;
				pos[i]=pos[i].prev;
			}
		}
		
	}
	
	static void print(int arr[], int n) 
	{ 
		for (int i=0; i<n; i++) 
			System.out.print(arr[i]+" "); 
	} 
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {170, 806,712,722,726,45, 75, 90, 802, 24, 2, 66,67,76,86,96,6}; 
		int n = arr.length; 
		radixsort(arr); 
		print(arr, n);
	}
}

class Node{
	int data;
	Node next,prev;
	Node(int d){
		data=d;
	}
}
