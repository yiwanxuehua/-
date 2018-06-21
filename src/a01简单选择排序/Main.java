/**
 * 
 */
package a01简单选择排序;

import java.util.Arrays;
import java.util.Random;

/**
  	@作者：yiwanxuehua
	@创建时间：2018年6月21日下午10:07:42
	@问题描述：

	@算法思路：
	简单选择：每次选i之后的一个最小值，放在i位置；
		1、起始位置i处，与后面的值比较，用k记录最小值的位置，
		2、比到末尾后，将i与k位置元素互换；继续i++循环；
 
 */

public class Main {
	public static void main(String[] args) {
		int t=10;
		int[]a =new int[t];
		for(int i=0;i<t;i++){
			a[i]=new Random().nextInt(t);
		}
		selectSort(a);
		System.out.println(Arrays.toString(a));
	}
	
    public static void selectSort(int[] array){
    	
        for(int i=0; i<array.length; i++){
            int k=i;
            for(int j=k+1; j<array.length;j++){
            	if(array[j]<array[k])
            		k=j;
            }
            if(k!=i){    //数据互换。将小的放前面
                int tem = array[i];
                array[i] = array[k];
                array[k] = tem;
            }
        }
    }

}
