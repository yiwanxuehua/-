/**
 * 
 */
package a02直接插入排序;

import java.util.Arrays;
import java.util.Random;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年6月21日下午10:18:12
	@算法思路：
	直接插入：每次将i位置元素，插入到i之前排好序的段中。
		[1]:先用tem保存i位置元素
		[2]:从i位置向前比较，若tem小，就将其向后移动，直到应该插入的位置；
 
 */
public class Main {
	public static void main(String[] args) {
		int t=10;
		int[]a =new int[t];
		for(int i=0;i<t;i++){
			a[i]=new Random().nextInt(t);
		}
		insertSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	//插入排序，按从小到大的顺序
    public static void insertSort(int[] array){
    	
        int j,tem; 
        for(int i = 1; i < array.length; i++){
            
        	tem=array[i];
        	j=i-1;
        	while(j>=0&&tem<array[j]){
        		array[j+1]=array[j];
        		j--;
        	}
        	array[j+1]=tem;
        }
    }
}
