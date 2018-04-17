package 快速排序;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int t=1000000;
		int[]a =new int[t];
		for(int i=0;i<t;i++){
			a[i]=new Random().nextInt(t);
		}
//		System.out.println(Arrays.toString(a));
		long time1=System.currentTimeMillis();
		QSort(a,0,a.length-1);
		long time2=System.currentTimeMillis();
//		System.out.println(Arrays.toString(a));
		System.out.println("快速排序用时："+(time2-time1));//140

	}
	
	private static void QSort(int[]a,int str,int end){
		if(str<end){
			int mid=partition(a,str,end);
			QSort(a,str,mid-1);
			QSort(a,mid+1,end);
		}else return;
	}
	private static int partition(int[]a,int str,int end){
		int key=a[str];
		while(str<end){
			while(str<end&&a[end]>=a[str])
				end--;
			swap(a,str,end);
			while(str<end&&a[str]<=a[end])
				str++;
			swap(a,str,end);			
		}
		return str;
	}
	private static void swap(int[]a,int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
