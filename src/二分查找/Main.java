/**
 * 
 */
package ���ֲ���;

import java.util.Arrays;
import java.util.Random;

/**
  	@���ߣ�yiwanxuehua
	@����ʱ�䣺2018��6��13������8:59:59
	@����������
���ֲ������⣺һ����������飬�ҳ������Ƿ��и������ҵ��������������ֵ��
	@�㷨˼·��
	��ѭ����Ŀ��>a[mid]ֵʱ��������a[mid]ֵ��
 */
public class Main {
	public static void main(String[] args) {
		int t=10;
		int[]a =new int[t];
		for(int i=0;i<t;i++){
			a[i]=new Random().nextInt(t);
		}
		Arrays.sort(a);
		System.out.println("���ɵ����������ǣ�"+Arrays.toString(a));
		int target=new Random().nextInt(t);
		System.out.println("Ҫ���Ҳ�����"+target+"���������");
		int res=getNum(a,target);
		System.out.println("����ǣ�"+res);
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
				res=a[mid];//������tar�����������
			}else{
				end=mid-1;
			}
		}
		return res;
	}

}
