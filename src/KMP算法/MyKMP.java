package KMP算法;

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
				//j>0时，若当前不匹配，则不断将dest的next[j]处与当前匹配，直到能匹配上转下，或者j=0；
				while(j>0&&str.charAt(i)!=str.charAt(j))
					j=next[j];
				if(str.charAt(i)==str.charAt(j))
					j++;//如果当前匹配，那么当前j+1；
				next[i+1]=j;//上面两步已经将j匹配完毕。
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
					System.out.println("字符串匹配起始处为："+"i-j+1");
					j=next[j];//如果考虑不能重复，则修改为为j=0;
				}
			}
		}
	 //时间复杂度O(m+n);
}
