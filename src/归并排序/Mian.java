package 归并排序;

import java.util.Arrays;
import java.util.Random;

public class Mian {
	public static void main(String[] args) {
		int t=1000000;
		int[]a =new int[t];
		for(int i=0;i<t;i++){
			a[i]=new Random().nextInt(t);
		}
		//System.out.println(Arrays.toString(a));
		long time1=System.currentTimeMillis();
		mergeSort(a);
		long time2=System.currentTimeMillis();
		//System.out.println(Arrays.toString(a));
		System.out.println("归并排序用时："+(time2-time1));//218
	}
	
	private static void mergeSort(int[]a){
		int[] res=new int[a.length];
		sort(a,0,a.length-1,res);
	}
	private static void sort(int[]a,int str,int end,int[]res){
		if(str<end){
			int mid=(str+end)/2;
			sort(a,str,mid,res);
			sort(a,mid+1,end,res);
			merge(a,str,mid,end,res);
		}
	}
	private static void merge(int[]a,int str,int mid,int end,int[]res){
		int i=str;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=end){
			if(a[i]<=a[j])
				res[k++]=a[i++];
			else res[k++]=a[j++];			
		}
		while(i<=mid){
			res[k++]=a[i++];
		}
		while(j<=end){
			res[k++]=a[j++];
		}
		k=0;
		while(str<=end){
			a[str++]=res[k++];
		}
	}
}
