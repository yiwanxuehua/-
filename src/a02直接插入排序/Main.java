/**
 * 
 */
package a02ֱ�Ӳ�������;

import java.util.Arrays;
import java.util.Random;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��6��21������10:18:12
	@�㷨˼·��
	ֱ�Ӳ��룺ÿ�ν�iλ��Ԫ�أ����뵽i֮ǰ�ź���Ķ��С�
		[1]:����tem����iλ��Ԫ��
		[2]:��iλ����ǰ�Ƚϣ���temС���ͽ�������ƶ���ֱ��Ӧ�ò����λ�ã�
 
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
	
	//�������򣬰���С�����˳��
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
