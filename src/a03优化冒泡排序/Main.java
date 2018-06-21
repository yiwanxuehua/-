/**
 * 
 */
package a03优化冒泡排序;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年6月21日下午10:33:45
	@算法思路：
 
 */

public class Main {
	public static void main(String[] args) {
		int t=100000;
		int[]a =new int[t];
		for(int i=0;i<t;i++){
			a[i]=new Random().nextInt(t);
		}
		
		long d1=System.currentTimeMillis();
		bubbleSort(a);
		System.out.println(System.currentTimeMillis()-d1);
	}
	
	public static void  bubbleSort(int[] array){
		boolean flag=true;
		int tem=0;
		
		for(int i=0;i<array.length;i++){
			flag=true;
			for(int j=0;j<array.length-i-1;j++){
				if(array[j+1]<array[j]){
					tem=array[j];
					array[j]=array[j+1];
					array[j+1]=tem;
					flag=false;
				}
			}
			if(flag==true)
				break;
		}
	}
}
