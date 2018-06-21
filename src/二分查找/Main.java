/**
 * 
 */
package 二分查找;

import java.util.Arrays;
import java.util.Random;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年6月13日下午8:59:59
	@问题描述：
二分查找问题：一个排序的数组，找出其中是否含有该数？找到该数的最大整数值？
	@算法思路：
	在循环的目标>a[mid]值时，保留该a[mid]值；
 */
public class Main {
	public static void main(String[] args) {
		int t=10;
		int[]a =new int[t];
		for(int i=0;i<t;i++){
			a[i]=new Random().nextInt(t);
		}
		Arrays.sort(a);
		System.out.println("生成的排序数组是："+Arrays.toString(a));
		int target=new Random().nextInt(t);
		System.out.println("要查找不超过"+target+"的最大整数");
		int res=getNum(a,target);
		System.out.println("结果是："+res);
	}
	static public int getNum(int[]a,int tar){
		int str=0;
		int end=a.length-1;
		int res=-1;
		while(str<=end){
			int mid=(str+end)/2;
			if(tar==a[mid]) return tar;
			if(tar>a[mid]){
				str=mid+1;
				res=a[mid];//不超过tar的最大整数；
			}else{
				end=mid-1;
			}
		}
		return res;
	}

}
