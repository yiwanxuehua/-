package 堆排序;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int t=1000000;
		int[]a =new int[t];
		for(int i=0;i<t;i++){
			a[i]=new Random().nextInt(t);
		}
		long time1=System.currentTimeMillis();
		sortHeap(a);
		long time2=System.currentTimeMillis();
		//System.out.println(Arrays.toString(a));
		System.out.println("一百万随机数堆排序用时："+(time2-time1));//358
	}
	
	private static void sortHeap(int[]a){
		int len=a.length;
		for(int i=(len-1)/2;i>=0;i--){
			sort(a,i,len-1);
		}
		
		for(int i=len-1;i>0;i--){
			swap(a,0,i);
			sort(a,0,i-1);
		}
	}
	
	private static void sort(int[]a,int str,int end){
		int tem=a[str];
		int j=str*2+1;
		for(;j<=end;j=j*2+1){
			if(j<end&&a[j]<a[j+1])
				j=j+1;
			if(tem>=a[j])
				break;
			a[str]=a[j];
			str=j;
		}
		a[str]=tem;
	}
	
	private static void swap(int []a,int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
