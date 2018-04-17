package KMP�㷨;

import java.util.Arrays;

public class MyKMP {
		private static void main(String[] args) {
			String str="aaba";
			String dest="aaabaabaaba";
			int []next=getNext(str);
			System.out.println(Arrays.toString(next));
			search(dest,str,next);
		}		
		private static int[] getNext(String str){			
			int []next =new int [str.length()+1];
			int j=0;
			next[0]=next[1]=0;
			for(int i=1;i<str.length();i++){
				//j>0ʱ������ǰ��ƥ�䣬�򲻶Ͻ�dest��next[j]���뵱ǰƥ�䣬ֱ����ƥ����ת�£�����j=0��
				while(j>0&&str.charAt(i)!=str.charAt(j))
					j=next[j];
				if(str.charAt(i)==str.charAt(j))
					j++;//�����ǰƥ�䣬��ô��ǰj+1��
				next[i+1]=j;//���������Ѿ���jƥ����ϡ�
			}
			return next;			
		}
		private static void search(String dest,String str,int[]next){
			int j=0;
			for(int i=0;i<str.length();i++){
				while(j>0&&str.charAt(i)!=dest.charAt(j))
					j=next[j];
				if(str.charAt(i)==dest.charAt(j))
					j++;
				if(j==dest.length()){
					System.out.println("�ַ���ƥ����ʼ��Ϊ��"+"i-j+1");
					j=next[j];//������ǲ����ظ������޸�ΪΪj=0;
				}
			}
		}
	 //ʱ�临�Ӷ�O(m+n);
}
