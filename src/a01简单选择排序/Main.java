/**
 * 
 */
package a01��ѡ������;

import java.util.Arrays;
import java.util.Random;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��6��21������10:07:42
	@����������

	@�㷨˼·��
	��ѡ��ÿ��ѡi֮���һ����Сֵ������iλ�ã�
		1����ʼλ��i����������ֵ�Ƚϣ���k��¼��Сֵ��λ�ã�
		2���ȵ�ĩβ�󣬽�i��kλ��Ԫ�ػ���������i++ѭ����
 
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
            if(k!=i){    //���ݻ�������С�ķ�ǰ��
                int tem = array[i];
                array[i] = array[k];
                array[k] = tem;
            }
        }
    }

}
